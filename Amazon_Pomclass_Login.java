package miniproject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pomclass_Login {

public WebDriver driver;
	
	public Amazon_Pomclass_Login(WebDriver launched_browser) {
		driver = launched_browser;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement username;			//harishvasanthi1409@gmail.com

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="ap_password")
	private WebElement password;			//vasanthiharish

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="signInSubmit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
}
