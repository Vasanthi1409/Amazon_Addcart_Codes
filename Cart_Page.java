package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public WebDriver driver;
	
	public Cart_Page(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-cart-count")
	private WebElement Cart;
	
	public WebElement getCart() {
		return Cart;
	}
	

}
