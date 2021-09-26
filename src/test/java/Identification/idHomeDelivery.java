package Identification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class idHomeDelivery {

	@FindBy (xpath = "//*[@id=\"menu-item-4363\"]/a")
	public static WebElement btnOrders;
	
	@FindBy (xpath = "//*[@id=\"locator-shipping\"]/span/span/span[1]/input")
	public static WebElement InputField;
	
	@FindBy (xpath = "//*[@id=\"select2-autocomplete_city-container\"]/span")
	public static WebElement CityField;
	
	@FindBy (xpath = "//*[@id=\"select2-autocomplete_street-container\"]/span")
	public static WebElement StreetField;
	
	@FindBy (xpath = "//*[@id=\"select2-autocomplete_city-results\"]/li")
	public static WebElement AlertCity;

	@FindBy (xpath = "")
	public static WebElement Ale;

	@FindBy (xpath = "")
	public static WebElement i;
	
	@FindBy (xpath = "")
	public static WebElement s;
	
	
	//*[@id="select2-autocomplete_city-results"]/li
}
