package miniproject.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pomclass_Search {
	
	public WebDriver driver;

	public Amazon_Pomclass_Search(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox") 
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbutton;

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
}
