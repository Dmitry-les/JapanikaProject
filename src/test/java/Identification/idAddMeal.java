package Identification;

import java.util.List;

import javax.swing.event.ListDataListener;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class idAddMeal {
	@FindBy (className = "cat-label")
	public static List<WebElement> Category;
	
	@FindBy (xpath = "//*[@id=\"products-wrapper\"]//*[contains(text(),'ארוחת פרש נודלס קידס עוף')]")
	public static WebElement Meal;
	
	@FindBy (xpath = "//*[@id=\"component_1164273\"]//*[contains(text(),'ספרייט אישי')]")
	public static WebElement Drink;
	
	@FindBy (id = "add-to-cart")
	public static WebElement AddToCart;
	
	@FindBy (xpath = "//*[@class=\"cart-item\"]/h4")
	public static List<WebElement> ChosenMeal;
	
}
