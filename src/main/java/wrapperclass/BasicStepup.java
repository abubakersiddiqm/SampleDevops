package wrapperclass;

import org.openqa.selenium.WebElement;

public interface BasicStepup {
	public void launchBrowser();
	public void getUrl(String urlName);
	public WebElement locatorName(String locatorType,String locatorPath);
	public void clickElement(WebElement ele);
	public void sendText(WebElement ele,String textValues);
	public void closeBrowser();
}
