package pages;

import org.openqa.selenium.WebElement;

import wrapperclass.PraticeForms;

public class ParticeFormTC001 extends PraticeForms {
	String url = "https://demoqa.com/automation-practice-form";
	public void tc001() throws Exception {
		launchBrowser();
		getUrl(url);
		WebElement firstName=locatorName("id", "firstName");
		sendText(firstName, "abubaker");
		WebElement lastName=locatorName("id", "lastName");
		sendText(lastName, "M");
		WebElement email = locatorName("id", "userEmail");
		sendText(email, "abu@email.com");
		WebElement phoneNo=locatorName("id", "userNumber");
		sendText(phoneNo, "90909090");
		Thread.sleep(7000);
		closeBrowser();
		
	}
}
