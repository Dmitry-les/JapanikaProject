package Tests;

import java.util.concurrent.TimeUnit;

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
		
		pom1 = new idChat();
		pom1 = PageFactory.initElements(driver, idChat.class);
		
		extent = Jap.GetExtent();
		test1 = Jap.createTest("Test1", "ChatOnLine");
	}
	@AfterClass
	public static void afterClass() throws InterruptedException {
		Thread.sleep(1000);
		extent.flush();
		driver.quit();
	}

	@Test
	public static void ChatOnLineTest(){

//		pom.BtnChatOnLine.click();   // יכשל טסט 
		pom1.BtnChat.click();         // יצליח טסט
//		func.IdentifyChat(test, "PASS", "FAIL");

		try {
			pom1.ChatWindow.isEnabled();
			test1.pass("test " + "ChatOnLine"+ " pass");
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " pass");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + " psss");

		}catch (Exception e) {
			test1.fail("test " + "ChatOnLine"+ " fail");
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " faild");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + " fail");
		}
	}
}
