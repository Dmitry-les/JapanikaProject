package Tests;

import org.testng.annotations.Test;

import Identification.idAddMeal;
import Japanika.ABA;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AddMeal extends ABA {

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.japanika.net/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	  pom4 = new idAddMeal();
	  pom4 = PageFactory.initElements(driver, idAddMeal.class);
	
	  extent = Jap.GetExtent();
	  test4 = Jap.createTest("Test4", "AddMeal");
	  }
	
  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(1000);
	  extent.flush();
	  driver.quit();
  }

  @Test (enabled= false, alwaysRun=true, groups = "CityValid") 
  public void AddMeal_1 () {
	  pom4.Category.get(0).click();
	  pom4.Meal.click();
	  pom4.Drink.click();
	  pom4.AddToCart.click();
	  
  }
}
