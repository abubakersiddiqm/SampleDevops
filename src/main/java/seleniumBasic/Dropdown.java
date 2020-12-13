package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
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
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		// using select to dropdown.

		Select sel = new Select(driver.findElement(By.tagName("select")));
		// select by value
		sel.selectByValue("DZA");
		Thread.sleep(3000);
		// select by index
		sel.selectByIndex(5);
		Thread.sleep(3000);
		// select by text
		sel.selectByVisibleText("India");
		Thread.sleep(3000);
		// getting selected dropdown value text
		System.out.println(sel.getAllSelectedOptions().get(0).getText());
		Thread.sleep(6000);
		// get list of options using getoptions
		List<WebElement> optionsFromDrp = sel.getOptions();
		// get the size of the dropdownvalue
		int optionssize = optionsFromDrp.size();
		System.out.println(optionssize);
		// getlist print the value
		for (int i = 0; i < optionssize; i++) {
			String text = optionsFromDrp.get(i).getText();
			System.out.println(text);
		}

		
		  // Other way without using select
		  //using for each
			driver.findElement(By.tagName("select")).click();
			List<WebElement> drop = driver.findElements(By.cssSelector("p>select>option"));
			int dropsize = drop.size();
			System.out.println(dropsize);
			for (WebElement dropvalues : drop) {
				System.out.println(dropvalues.getText());
				if (dropvalues.equals("Cuba")) {
					dropvalues.click();
					break;
				}
			}

			//using for loop
			for (int i = 0; i < dropsize; i++) {

				String valuesof = driver.findElements(By.cssSelector("p>select>option")).get(i).getText();
				System.out.println(valuesof);
				if (valuesof.equals("Cuba")) {
					driver.findElements(By.cssSelector("p>select>option")).get(i).click();
					break;
				}
			}
		 
		Thread.sleep(3000);
		driver.quit();

	}
}
