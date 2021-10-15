package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Identification.idAddMeal;
import Identification.idChat;
import Identification.idHomeDelivery;
import Japanika.ABA;

public class TestsTests extends ABA {
	
	public static WebDriver driver;
	public static idChat pom1;
	public static idHomeDelivery pom2;
	public static idAddMeal pom4;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.japanika.net/shop/");
		pom2 = new idHomeDelivery();
		pom2 = PageFactory.initElements(driver, idHomeDelivery.class);
		
		pom4 = new idAddMeal();
		pom4 = PageFactory.initElements(driver, idAddMeal.class);
	
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
		pom4.Category.get(6).click();
		pom4.Meal1.click();
		pom4.Drink1.click();
		pom4.AddToCart.click();
		pom4.Category.get(2).click();
		pom4.Meal2.click();
		pom4.Gluten.get(1).click();
		pom4.AddToCart.click();
		List<WebElement> ListMeal = driver.findElements(By.xpath("//button[@class='edit-prd']"));
			for (WebElement MealChange : ListMeal) {
				Thread.sleep(1000);
				if (MealChange.getAttribute("title").equals("עריכת המוצר ארוחת פרש נודלס קידס עוף")) {
					MealChange.click();
				}
			}
		Thread.sleep(2000);
		pom4.Drink2.click();    //בחירת סודה אישית
		pom4.AddToCart.click();
		System.out.println(pom4.Drink2.getText());
}

}
