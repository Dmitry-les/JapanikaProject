package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Identification.idAddMeal;
import Identification.idChat;
import Identification.idHomeDelivery;
import Japanika.ABA;

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
		test2 = Jap.createTest("Test2", "CityNotValid");
		test3 = Jap.createTest("Test3", "CityValid");
		test4 = Jap.createTest("Test4", "AddMeal_1");
		test5 = Jap.createTest("Test5", "AddMeal_2");
	}
	@AfterClass(alwaysRun=true)
	public void afterClass() throws InterruptedException {
		Thread.sleep(1000);
		extent.flush();
//		driver.quit();
	}
	
	@Test (enabled= false, priority = 1) 
	public static void CityNotValidTest(){
		pom2.btnOrders.click();
		pom2.CityField.click();
		func.HomeDeliveryNotValid(test2," CityNotValid ", "הקלד לפחות 2 תווים ונווט עם חיצי המקלדת");
	}

	@Test (enabled= true, priority = 2) 
	public static void CityValidTest() throws InterruptedException{
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
		func.CompareValue(test3," CityValid ", pom2.Category.get(0).getText() , "יש לי קופון");
	}
	
	@Test (enabled= true, priority = 3,
			dependsOnMethods = {"CityValidTest"}, alwaysRun = true) 
	public void AddMeal_1Test () {
//		Select mySelection = new Select(pom4.Category);
//		mySelection.selectByVisibleText("בהרכבה סושי");
//		System.out.println(mySelection);
		pom4.Category.get(6).click();
		pom4.Meal1.click();
		pom4.Drink.click();
		pom4.AddToCart.click();
		func.CompareValue(test4," AddMeal_1Test ", pom4.ChosenMeal.get(0).getText(), pom4.Meal1.getText());  
	  }
	
	@Test (enabled = true, priority = 4,
			dependsOnMethods = {"AddMeal_1Test"}) 
	public void AddMeal_2Test () {
		pom4.Category.get(2).click();
		pom4.Meal2.click();
		pom4.Gluten.get(1).click();
		pom4.AddToCart.click();
		System.out.println(pom4.ChosenMeal.get(1).getText());  //   get (???)
		System.out.println(pom4.Meal2.getText());

		func.CompareValue(test5," AddMeal_2 ", pom4.ChosenMeal.get(1).getText(), pom4.Meal2.getText());  
	  }
	
}


