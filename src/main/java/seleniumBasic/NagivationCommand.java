package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NagivationCommand {
	
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//nagavite to url
		driver.navigate().to("https://demoqa.com/text-box");
		//implicate wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Nagivation command to back,refresh,forward
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
	}
}
