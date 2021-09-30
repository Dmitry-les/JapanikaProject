package Identification;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class idAddMeal {

	@FindBy (className = "cat-label")
	public static List<WebElement> Category;
	

	@FindBy (className = "product-inner")
	public static List<WebElement> Meal;
}
