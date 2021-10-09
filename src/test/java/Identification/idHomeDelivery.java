package Identification;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class idHomeDelivery {
	
	@FindBy (xpath = "//*[@id=\"menu-item-4363\"]/a")
	public static WebElement btnOrders;
	
	@FindBy (xpath = "//*[@id=\"locator-shipping\"]/span/span/span[1]/input")
	public static WebElement InputField;
	
	@FindBy (xpath = "//*[@id=\"select2-autocomplete_city-container\"]/span")
	public static WebElement CityField;
	
	@FindBy (xpath = "//*[@id=\"select2-autocomplete_city-results\"]/li")
	public static WebElement AlertCity;

	@FindBy(className = "select-item")
	public static List<WebElement> City;
	
	@FindBy(className = "select-item")
	public static List<WebElement> Street;
	
	@FindBy (id = "house_number")
	public static WebElement HouseNumber;
	
	@FindBy (id = "approve")
	public static WebElement Approve;
	
	@FindBy (className = "cat-label")
	public static List<WebElement> Category;
	
	@FindBy (className = "//button[@class='edit-prd']")
	public static List<WebElement> MealChange;
	
//	@FindBy (className = "//*[@class=\"edit-prd\"]")
//	public static WebElement MealChange;
//	
	
	
}
