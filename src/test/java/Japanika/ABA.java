package Japanika;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Identification.idChat;

public class ABA {
	public static WebDriver driver;
	public static idChat pom;
	public static Functions func;
	public static ExtentManager Jap = new ExtentManager(driver);
	public static ExtentReports extent;
	public static ExtentTest test;
}
