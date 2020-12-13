package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameswitch {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// implicate wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// Go to Site Url
		driver.get("https://demoqa.com/frames");
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		WebElement frame2 = driver.findElement(By.id("frame2"));
		//Switch to frame 1 
		driver.switchTo().frame(0);
		String frameText = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(frameText);
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		String frameText2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(frameText2);
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
