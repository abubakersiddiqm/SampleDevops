package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAndCheckbox {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// implicate wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Go to Site Url
		driver.get("https://demoqa.com/automation-practice-form");
		// Validate is button is selected using isSelected()
		//Return type boolean
		boolean isRadioButton = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		System.out.println("BeforeSelectedradiobutton " + isRadioButton);
		//to select the radio button 
		if (!isRadioButton) {
			driver.findElement(By.cssSelector("div>label[for='gender-radio-1']")).click();
			System.out.println("AfterSelectedradiobutton " + driver.findElement(By.xpath("//input[@value='Male']")).isSelected());
		}
		else {
			System.out.println("Already Radiobutton is already selected");
		}
		Thread.sleep(3000);
		
		//Validate the checkbox is selected using isSelected() 
		boolean isCheckBox = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println("checkbox " + isCheckBox);
		
		//To check the checkbox based on the condition.
		if (!isCheckBox) {
			driver.findElement(By.cssSelector("div>label[for='hobbies-checkbox-1']")).click();
			System.out.println("AfterCheckboxisSelected"+driver.findElement(By.xpath("//input[@value='1']")).isSelected());
		} else {
			System.out.println("Already Checkbox button is already selected");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
