package Identification;

	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByXPath;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

public class idChat {
		
//		@FindBy (xpath = "//*[@id=\"home-ui\"]/div[3]/a")
//		public static WebElement BtnChatOnLine;
		
		@FindBy (xpath = "//*[@id=\"home-ui\"]/div[3]/a/img")
		public static WebElement TitleChat;
	
		@FindBy(className = "intercom-launcher")
		public static WebElement BtnChat;
		
		@FindBy (xpath = "//*[@id=\"intercom-container\"]/div/div[1]/iframe")
		public static WebElement ChatWindow;
		
		}

