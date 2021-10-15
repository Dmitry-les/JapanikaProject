package Identification;

import java.util.List;

import javax.swing.event.ListDataListener;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class idAddMeal {
	@FindBy (className = "cat-label")
	public static List<WebElement> Category;
	
	@FindBy (xpath = "//*[@id=\"products-wrapper\"]//*[contains(text(),'ארוחת פרש נודלס קידס עוף')]")
	public static WebElement Meal1;
	
	@FindBy (xpath = "//*[@id=\"component_1164273\"]//*[contains(text(),'ספרייט אישי')]")
	public static WebElement Drink1;
	
	@FindBy (xpath = "//*[@id=\"component_1164273\"]//*[contains(text(),'סודה אישי')]")
	public static WebElement Drink2;
	
	@FindBy (id = "add-to-cart")
	public static WebElement AddToCart;
	
	@FindBy (xpath = "//*[@class=\"cart-item\"]/h4")
	public static List<WebElement> ChosenMeal;
	
	@FindBy (xpath = "//*[@id=\"products-wrapper\"]//*[contains(text(),'אדממה')]")
	public static WebElement Meal2;
	
	@FindBy (className = "cb_label")
	public static List<WebElement> Gluten;
	
	@FindBy (className = "//button[@class='close']")
	public static List<WebElement> Close;
	
	@FindBy (xpath = "//button[@class='edit-prd']")
	public static List<WebElement> ListMealChange;
	
	
	
	
}
