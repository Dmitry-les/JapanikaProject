package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Identification.idChat;
import Identification.idHomeDelivery;
import Japanika.ABA;

public class HomeDelivery extends ABA {

	@BeforeClass
	public void beforeClass() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.japanika.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		pom2 = new idHomeDelivery();
		pom2 = PageFactory.initElements(driver, idHomeDelivery.class);
		
		extent = Jap.GetExtent();
		test2 = Jap.createTest("Test2", "CityNotValid");

	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(1000);
		extent.flush();
		driver.quit();
	}

	@Test
	public static void CityNotValidTest(){
		pom2.btnOrders.click();
		pom2.CityField.click();
		func.HomeDelivery(test2," CityNotValid ", "הקלד לפחות 2 תווים ונווט עם חיצי המקלדת");
	}	
}

