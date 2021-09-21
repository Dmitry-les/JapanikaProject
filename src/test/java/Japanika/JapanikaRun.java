package Japanika;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class JapanikaRun {
	
	static WebDriver driver;
	static PomJapanika pom;
	static ExtentManager Jap = new ExtentManager(driver);
	static ExtentReports extent;
	static ExtentTest test1;

	
  @BeforeClass
  public static void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.japanika.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		pom = new PomJapanika();
		pom = PageFactory.initElements(driver, PomJapanika.class);
		
		extent = Jap.GetExtent();
		test1 = Jap.createTest("test1", "ChatOnLine");
  }

  @AfterClass
  public static void afterClass() {
		extent.flush();
//		driver.quit();
  }
  @Test
  public void test1() throws InterruptedException {
	  
	  pom.ChatOnLine.click();

	  driver.findElement(By.className("intercom-launcher")).click();

	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div[1]/iframe")));
  
	  driver.findElement(By.xpath("//*[@class=\"intercom-messenger-frame intercom-501b9j e52psle0 intercom-messenger-frame-enter-done\"]"));
	  
	  Thread.sleep(2000);

	  driver.switchTo().defaultContent();

	  
	  
	  
	  

//	  if (driver.getTitle().equals("בית - Japanika")) {
//		  test1.fail("ChatOnLine - test fail");	
//	  }else {
//		  test1.pass("ChatOnLine - test pass");
//	  }
//	  Thread.sleep(2000);
//	 
	  
  }
  

}
