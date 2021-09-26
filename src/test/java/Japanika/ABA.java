package Japanika;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Identification.idChat;
import Identification.idHomeDelivery;

public class ABA {
	public static WebDriver driver;
	public static idChat pom1;
	public static idHomeDelivery pom2;
	public static Functions func;
	public static ExtentManager Jap = new ExtentManager(driver);
	public static ExtentReports extent;
	public static ExtentTest test1;
	public static ExtentTest test2;

}
