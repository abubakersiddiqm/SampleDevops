package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicCommand {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		//implicate wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter the Url
		driver.get("https://demoqa.com/text-box");
		//get Title
		String title = driver.getTitle();
		System.out.println("Title is : "+ title);
		//get current url
		String currentURL=driver.getCurrentUrl();
		System.out.println("current url is "+currentURL);
		
		WebElement userName= driver.findElement(By.id("userName"));
		String tagName =userName.getTagName();
		System.out.println("tag  :" +tagName);
		
		Dimension size = userName.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		
		System.out.println(height+ " getSize() " +width);
		
		Point location = userName.getLocation();
		System.out.println(location.getX()+"  getlocation() "+location.getY());
		
		String cssValueIs=userName.getCssValue("Font");
		System.out.println("cssValueIs" +cssValueIs);
		
		
		
		
		//to close the browser
		driver.quit();
		
		
	}
	
}
