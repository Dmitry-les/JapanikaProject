package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Identification.idChat;
import Japanika.ABA;

public class ChatOnLine extends ABA {
	
	@BeforeClass
	public static void beforeClass() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.japanika.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		pom = new idChat();
		pom = PageFactory.initElements(driver, idChat.class);
		
		extent = Jap.GetExtent();
		test = Jap.createTest("test1", "ChatOnLine");
	 }

	@AfterClass
	public static void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		extent.flush();
		driver.quit();
	}
	@Test
	public static void ChatOnLineTest() throws InterruptedException {
		  
		pom.BtnChatOnLine.click();
//		pom.BtnChat.click();
		Thread.sleep(2000);

	  try {
		  	driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div[1]/iframe"));
		  
			System.out.println("pass");

	} catch (Exception e) {
			System.out.println("faild");
	}
	
  }
}
