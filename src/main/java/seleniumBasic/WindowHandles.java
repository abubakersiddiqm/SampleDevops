package seleniumBasic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		//implicate wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multi-PopUp Test #2')]")).click();
		Thread.sleep(3000);
		//windows
		Set<String>windows=driver.getWindowHandles();
		//no of windows
		int noOfwindows=windows.size();
		System.out.println(" Noofwindows "+noOfwindows);
		
		//switch windows one way
		
		/*
		 * driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		 * System.out.println(driver.getCurrentUrl());
		 */
	//
		//Two way
		for (String window : windows) {
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			driver.close();	
		}
		
		//third way
		for (int i = 0; i < noOfwindows ; i++) {
			driver.switchTo().window(windows.toString());
			System.out.println(driver.getCurrentUrl());
			if (i==3) {
				driver.close();
			}
		}

	}
}
