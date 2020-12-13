package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommands {
	
	@Test
	public void startTest() {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//implicate wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Go to Site Url
		driver .get("https://demoqa.com/automation-practice-form");
		//Enter the first name and Lastname
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Rafan");
		
		//get the text from the textbox use getAttribute
		String textBoxValues=driver.findElement(By.id("firstName")).getAttribute("value");
		System.out.println(textBoxValues);
		
		//get the text from the label or dropdown
		String textOfGender = driver.findElement(By.cssSelector("div>label[for='gender-radio-1']")).getText();
		System.out.println("Label Text is : "+textOfGender);
		
		//To close the browser
		driver.quit();
	}

}
