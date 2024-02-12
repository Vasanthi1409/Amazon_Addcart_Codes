package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Close_Addcart {
	
	public WebDriver driver;
	
	public Close_Addcart(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="attach-close_sideSheet-link")
	private WebElement closeaddcart;

	public WebElement getCloseaddcart() {
		return closeaddcart;
	}

}
