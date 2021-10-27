package Tests;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Identification.idChat;
import Japanika.ABA;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatOnLine extends ABA {
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima\\Japanika//chromedriver.exe");
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.japanika.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		pom1 = new idChat();
		pom1 = PageFactory.initElements(driver, idChat.class);
		
		extent = Jap.GetExtent();
		test1 = Jap.createTest("ChatOnLineTest", "ChatOnLine");
	}
	
	@AfterClass
	public static void afterClass() throws InterruptedException {
		Thread.sleep(1000);
		extent.flush();
//		driver.quit();
	}
	
	@Test
	public static void ChatOnLineTest() throws AWTException, IOException{
		pom1.BtnChatOnLine.click();   // יכשל טסט 
//		pom1.BtnChat.click();         // יצליח טסט
		func.IdentifyChat(test1, "1", " ChatOnLine ");

	}
}
