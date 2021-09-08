package Japanika;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomJapanika {

	@FindBy (how = How.XPATH, using = "//*[@id=\"home-ui\"]/div[3]/a")
	static WebElement ChatOnLine;
	
	
	
	
	/*
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
	static WebElement serachResults1;
	
	@FindBy (how = How.NAME, using = "")
	static WebElement user;
	
	@FindBy (how = How.ID, using = "serachResults")
	static WebElement serachResults;
	
	@FindBy(className = "")
	static List<WebElement> add_button;
	*/
	
	}
