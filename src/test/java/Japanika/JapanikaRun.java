package Japanika;

import org.testng.annotations.Test;

import Tests.ChatOnLine;

public class JapanikaRun extends ABA {
	
	 @Test
	 public void test1() {
			ChatOnLine.ChatOnLineTest();
	 }
}
	
//@BeforeClass
//  public static void beforeClass() {
//	  
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Dima//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.japanika.net/");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		
//		pom = new idChat();
//		pom = PageFactory.initElements(driver, idChat.class);
//		
//		extent = Jap.GetExtent();
//		test = Jap.createTest("test1", "ChatOnLine");
//  }
//
//  @AfterClass
//  public static void afterClass() throws InterruptedException {
//		Thread.sleep(2000);
//		extent.flush();
//		driver.quit();
//  }
//  @Test
//  public void test1() throws InterruptedException {
//	  
//	  pom.BtnChatOnLine.click();
////	  pom.BtnChat.click();
//	  Thread.sleep(2000);
//
//  try {
//	  	driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div[1]/iframe"));
//	  
//		System.out.println("pass");
//
//} catch (Exception e) {
//		System.out.println("faild");
//		
//
//}

//	  if (driver.getTitle().equals("בית - Japanika")) {
//		  test1.fail("ChatOnLine - test fail");	
//	  }else {
//		  test1.pass("ChatOnLine - test pass");
//	  }
//	  Thread.sleep(2000);
//	 
	  
