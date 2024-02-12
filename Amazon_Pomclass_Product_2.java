package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pomclass_Product_2 {
	
	public WebDriver driver;
	
	public Amazon_Pomclass_Product_2(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@class='a-button-text'])[1]")
	private WebElement product_2;

	public WebElement getProduct_2() {
		return product_2;
	}

}
