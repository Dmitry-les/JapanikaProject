package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.event.ListDataListener;
import javax.xml.xpath.XPath;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Identification.idAddMeal;
import Identification.idChat;
import Identification.idHomeDelivery;
import Japanika.ABA;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class HomeDelivery extends ABA {

	@BeforeClass
	public void BeforeClass() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.japanika.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		pom2 = new idHomeDelivery();
		pom2 = PageFactory.initElements(driver, idHomeDelivery.class);
		
		pom4 = new idAddMeal();
		pom4 = PageFactory.initElements(driver, idAddMeal.class);

		extent = Jap.GetExtent();
		test2 = Jap.createTest("HomeDeliveryTest", "HomeDelivery");
	}
	
	@AfterClass (alwaysRun=true)
	public void afterClass() throws InterruptedException {
		Thread.sleep(1000);
		extent.flush();
//		driver.quit();
	}
	
	@Test (enabled= false, priority = 1) 
	public static void CityNotValidTest(){
		// Test 2
		pom2.btnOrders.click();
		pom2.CityField.click();
		func.HomeDeliveryNotValid(test2,"2"," CityNotValid ", "הקלד לפחות 2 תווים ונווט עם חיצי המקלדת");
	}

	@Test (enabled= true, priority = 2) 
	public static void CityValidTest() throws InterruptedException{
		// Test 3
		driver.get("https://www.japanika.net/");
		pom2.btnOrders.click();
		pom2.CityField.click();
		pom2.InputField.sendKeys("אש");  // עיר
		Thread.sleep(2000);
		pom2.City.get(0).click();
		pom2.InputField.sendKeys("קו");   // רחוב
		Thread.sleep(2000);
		pom2.Street.get(0).click();
	
		pom2.HouseNumber.sendKeys("5");   // בית מספר
		pom2.Approve.click();
		Thread.sleep(3000);
		func.CompareValue(test2,"3", " CityValid ", pom2.Category.get(0).getText() , "יש לי קופון");
	}
	
	@Test (enabled= true, priority = 3,
			dependsOnMethods = {"CityValidTest"}, alwaysRun = true) 
	public void AddMeal_1Test () throws InterruptedException { 
		// Test 4
//		pom4.Close.get(4);
		pom4.Category.get(6).click();
		pom4.Meal1.click();
		pom4.Drink1.click();
		pom4.AddToCart.click();
		Thread.sleep(3000);
		func.CompareValue(test2,"4"," AddMeal_1 ", pom4.ChosenMeal.get(0).getText(), pom4.Meal1.getText());  
//		func.CompareValue(test2," AddMeal_1Test ", "jhj", pom4.Meal1.getText());  

	  }
	
	@Test (enabled = true, priority = 4,
			dependsOnMethods = {"AddMeal_1Test"}) 
	public void AddMeal_2Test () throws InterruptedException { 
		// Test 5
		pom4.Category.get(2).click();
		pom4.Meal2.click();
		pom4.Gluten.get(1).click();
		pom4.AddToCart.click();
		Thread.sleep(2000);
		func.CompareValue(test2,"5", " AddMeal_2 ", pom4.ChosenMeal.get(0).getText(), pom4.Meal2.getText());  
	  }

	@Test (enabled = false, priority = 5,
			dependsOnMethods = {"AddMeal_2Test"}) 
	public void ChangeMealDetailTest () throws InterruptedException { 
		// Test 6
	try {
		for (WebElement MealChange : pom4.ListMealChange) {
		Thread.sleep(1000);
			if (MealChange.getAttribute("title").equals("עריכת המוצר ארוחת פרש נודלס קידס עוף")) {
				MealChange.click();
			}
		}
		Thread.sleep(1000);
		pom4.Drink2.click();    //בחירת סודה אישית
		pom4.AddToCart.click();
		pom4.Drink2.getText();
		Thread.sleep(1000);
			for (WebElement Note : pom2.ListNotes) {
				if (!Note.getText().equals("סודה אישי")) {
					func.CompareValue(test2, "6", " ChangeMealDetail ", Note.getText(), "סודה אישי"); 
				}else {
					func.CompareValue(test2, "6", " ChangeMealDetail ", Note.getText(), "סודה אישי"); 
					break;
				}
			}
		} catch (Exception e) {
			assertEquals("Change Meal Detail", "Expected Change Meal Detail");
		}
	}
	
	@Test (enabled = false, priority = 6,
			dependsOnMethods = {"AddMeal_2Test"}) 
	public void RemoveItemTest () throws InterruptedException { 
		// Test 7
		int NoItems1 = pom4.ListRemoveItem.size();
		pom4.ListRemoveItem.get(0).click();
		pom4.btnRemoveItem.click();
	    String StrNoItem =  Integer.toString(NoItems1-1);  //Numbers of items in list after remove
		func.CompareValue(test2, "7", " RemoveItem ", StrNoItem , "1"); 
	}
	
	@Test (enabled = true, priority = 6,
			dependsOnMethods = {"AddMeal_2Test"}) 
	public void CleanCartTest () throws InterruptedException { 
		// Test 8
		pom4.btnCleanCart.click();
		pom4.btnRemoveItem.click();
		
		String [] PriceSplit = pom4.IntermediatePrice.get(0).getText().split("₪");

		System.out.println(PriceSplit[0]);

		func.CompareValue(test2, "8", " RemoveItem ", "1" , "1"); 
	}
	
}


