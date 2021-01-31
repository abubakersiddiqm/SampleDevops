package testNgpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellalExecution2 {
@Test
@Parameters("names")
public void testCase2(String names) throws InterruptedException {
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
	userName.sendKeys(names);
	String tagName =userName.getTagName();
	System.out.println("tag  :" +tagName);
	//to close the browser
	Thread.sleep(8000);
	driver.quit();
}
}
