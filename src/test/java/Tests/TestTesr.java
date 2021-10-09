package Tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Japanika.ABA;

public class TestTesr extends ABA {

	@FindBy (className = "//*[@class=\"edit-prd\"]")
	public static List<WebElement> MealChange;
	
	
}
