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
	
	@FindBy (xpath = "//*[@id=\"products-wrapper\"]//*[contains(text(),'אדממה')]")
	public static WebElement Meal2;
	
	@FindBy (xpath = "//*[@id=\"products-wrapper\"]//*[contains(text(),'מרק מיסו')]")
	public static WebElement Meal3;
	
	@FindBy (xpath = "//*[@id=\"component_1164273\"]//*[contains(text(),'ספרייט אישי')]")
	public static WebElement Drink1;
	
	@FindBy (xpath = "//*[@id=\"component_1164273\"]//*[contains(text(),'סודה אישי')]")
	public static WebElement Drink2;
	
	@FindBy (id = "add-to-cart")
	public static WebElement AddToCart;
	
	@FindBy (xpath = "//*[@class=\"cart-item\"]/h4")
	public static List<WebElement> ChosenMeal;
	
	@FindBy (className = "cb_label")
	public static List<WebElement> Gluten;
	
	@FindBy (className = "item-name")
	public static List<WebElement> NoTofu;

	@FindBy (xpath = "//button[@class='edit-prd']")
	public static List<WebElement> ListMealChange;
	
	@FindBy (xpath = "//button[@class='sub']")
	public static List<WebElement> ListRemoveItem;
	
	@FindBy (xpath = "//button[@class='add']")
	public static List<WebElement> ListAddItem;
	
	@FindBy (xpath = "//button[@class='siteBtn basic ok']")
	public static WebElement btnRemoveItem;
	
	@FindBy (xpath = "//a[@class='clean_cart siteBtn']")
	public static WebElement btnCleanCart;
	
	@FindBy (xpath = "//*[@id=\"totals\"]/div[1]/strong/span")
	public static WebElement IntermediatePrice;
	
	@FindBy (xpath = "//*[@id=\"go_to_checkout\"]")
	public static WebElement btnToPay;
	
	@FindBy (xpath = "//div[@class='locator-minimum-order']")
	public static WebElement AllertShow;
	
	@FindBy (xpath = "//*[@id=\"checkout-hedaer\"]/div/h1")
	public static WebElement Payment;
	

}
