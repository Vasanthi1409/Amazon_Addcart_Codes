package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pomclass_Product_1 {
	
	public WebDriver driver;
	
	public Amazon_Pomclass_Product_1(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[contains(text(), '12 (Flowy Emerald, 12 GB RAM, 256GB)')])[3]")
	private WebElement product_1;

	public WebElement getProduct_1() {
		return product_1;
	}

}
