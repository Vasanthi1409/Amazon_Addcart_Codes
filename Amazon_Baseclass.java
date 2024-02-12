package miniproject.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver browser_Launch(String browser){
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void sendkeys(WebElement locator, String data) {
		locator.sendKeys(data);
	}
	
	public static void click(WebElement locator) {
		locator.click();
	}
	
	public static void wait(WebDriver launched_driver, int sec) {
		launched_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void window_Handling() {
		Set<String> multiplewindows = driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>(multiplewindows);
		driver.switchTo().window(list.get(1));
	}
	
	public static void clear(WebElement locator) {
		locator.clear();
	}
	
	
	public static void actions(WebDriver launched_driver, WebElement locator) {
		Actions act = new Actions(launched_driver);
		act.click(locator).build().perform();
	}
	
	public static void scrnshot(WebDriver launched_driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) launched_driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Maven_TCF\\src\\main\\java\\miniproject\\com\\Capture.png");
		FileUtils.copyFile(SRC, DES);
	}
}