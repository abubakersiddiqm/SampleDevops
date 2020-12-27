package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/abubakersiddiqm/eclipse-workspace/basic/drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(30000);
		driver.close();
			//https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver	
	}
}
