package Japanika;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;

public class Functions extends ABA {
	
	public void IdentifyChat (ExtentTest test, String x, String y){
	
		try {
			pom1.ChatWindow.isEnabled();
			test.pass("test " + "ChatOnLine"+ x);
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " pass");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + x);

		}catch (Exception e) {
			test.fail("test " + "ChatOnLine"+ y);
//			test.pass("test " + pom.TitleChat.getAttribute("alt")+ " faild");   // עברית קורא לא
			System.out.println("test " + pom1.TitleChat.getAttribute("alt") + y);
		}
		
	}
}
