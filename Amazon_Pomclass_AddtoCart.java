package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pomclass_AddtoCart {
	
	public WebDriver driver;
	
	public Amazon_Pomclass_AddtoCart(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
}
