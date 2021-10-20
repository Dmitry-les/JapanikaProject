package Japanika;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Functions extends ABA {
	
	public static void IdentifyChat (ExtentTest test, String testNumber, String testName) throws AWTException, IOException{
	
		try {
			pom1.ChatWindow.isEnabled();
			test.pass("Test" + testNumber + testName + " Pass");
			System.out.println("Test " + testNumber + testName + " Pass");

		}catch (Exception e) {
			test.fail("Test" + testNumber + testName + " Fail",
				MediaEntityBuilder.createScreenCaptureFromPath(Jap.CaptureScreen( driver)).build());
			System.out.println("Test " + testNumber + testName + " Fail");
			assertEquals("1","2");
		}
	}
	
	public static void HomeDeliveryNotValid (ExtentTest test, String testNumber, 
			String testName, String MyAlertName) throws AWTException, IOException{

		if (pom2.AlertCity.getText().equals(MyAlertName)) {
			pom2.InputField.sendKeys("א");
			if (pom2.AlertCity.getText().equals(MyAlertName)) {
				test.pass("Test" + testNumber + testName + "Pass");
				System.out.println("Test" + testNumber + testName + "Pass");
			} else {
				test.fail("Test" + testNumber + testName + "Fail",
					MediaEntityBuilder.createScreenCaptureFromPath(Jap.CaptureScreen( driver)).build());
				System.out.println("Test" + testNumber + testName + "Fail");
				assertEquals("1","2");
			}
		} else {
			test.fail("Test" + testNumber +  testName + "Fail",
				MediaEntityBuilder.createScreenCaptureFromPath(Jap.CaptureScreen( driver)).build());
			System.out.println("טסט נפל בלחיצה על שדה עיר");
			assertEquals("1","2");
		}
	}
	
	public static void CompareValue (ExtentTest test, String testNumber, 
			String testName, String x, String y) throws AWTException, IOException{

		if (x.equals(y)) {
			test.pass("Test" + testNumber + testName + "Pass");
			System.out.println("Test" + testNumber + testName + "Pass");
		} else {
			test.fail("Test"+ testNumber + testName + "Fail",
				MediaEntityBuilder.createScreenCaptureFromPath(Jap.CaptureScreen( driver)).build());
			System.out.println("Test" + testNumber + testName + "Fail");
			assertEquals("1","2");
		}
	}
}