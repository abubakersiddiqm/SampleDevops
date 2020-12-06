package wrapperclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeForms implements BasicStepup{
	
	WebDriver driver;
	//launch user prefer browser.
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	//get Url
	
	public void getUrl(String urlName) {
		driver.get(urlName);
	}

	//locator types
	public WebElement locatorName(String locatorType,String locatorPath) {
		
		switch (locatorType) {
		case "id":
			return driver.findElement(By.id(locatorPath));
		case "name":
			return driver.findElement(By.name(locatorPath));
		default:
			break;
		}
		return null;
		
	}
	
	//click element
	public void clickElement(WebElement ele) {
		ele.click();
	}
	
	//sendKeys
	public void sendText(WebElement ele,String textValues) {
		ele.clear();
		ele.sendKeys(textValues);
	}
//close browser
	public void closeBrowser() {
		driver.quit();
	}
}
