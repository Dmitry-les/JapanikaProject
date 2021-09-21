package Identification;

	import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

public class idChat {
	
		@FindBy (how = How.XPATH, using = "//*[@id=\"home-ui\"]/div[3]/a")
		public static WebElement BtnChatOnLine;
		
//		@FindBy(className = "intercom-launcher")
//		public static WebElement BtnChat;
		
		@FindBy (how = How.XPATH, using = "//*[@id=\\\"intercom-container\\\"]/div/div[1]/iframe")
		public static WebElement ChatWindow;
		
		
		/*
		@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
		public static WebElement serachResults1;
		
		@FindBy (how = How.NAME, using = "")
		public static WebElement user;
		
		@FindBy (how = How.ID, using = "serachResults")
		public static WebElement serachResults;
		
		@FindBy(className = "")
		public static List<WebElement> add_button;
		*/
		
		}

