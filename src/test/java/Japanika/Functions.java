package Japanika;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;

public class Functions extends ABA {
	
	public static void IdentifyChat (ExtentTest test, String testName){
	
		try {
			pom1.ChatWindow.isEnabled();
			test.pass("test " + testName + " pass");
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " pass");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + " pass");

		}catch (Exception e) {
			test.fail("test " + testName + " fail");
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " faild");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + " fail");
		}
	}
	
	public static void HomeDeliveryNotValid (ExtentTest test,String testName, String MyAlertName){

		if (pom2.AlertCity.getText().equals(MyAlertName)) {
			pom2.InputField.sendKeys("א");
			if (pom2.AlertCity.getText().equals(MyAlertName)) {
				test2.pass("test" + testName + "pass");
				System.out.println("test" + testName + "pass");
			} else {
				test2.fail("test" + testName + "fail");
				System.out.println("test" + testName + "fail");
			}
		} else {
			test2.fail("test" + testName + "fail");
			System.out.println("טסט נפל בלחיצה על שדה עיר");
		}
	}
	
	public static void CompareValue (ExtentTest test, String testName, String x, String y){

		if (x.equals(y)) {
			test3.pass("test" + testName + "pass");
			System.out.println("test" + testName + "pass");
		} else {
			test3.fail("test" + testName + "fail");
			System.out.println("test" + testName + "fail");
		}
	}
}