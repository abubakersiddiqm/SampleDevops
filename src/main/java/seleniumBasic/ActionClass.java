package seleniumBasic;

import java.util.concurrent.TimeUnit;

import javax.crypto.KeyAgreementSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		// implicate wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/sortable");

		Actions act = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath("//div[@class='vertical-list-container mt-4']/div[1]"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='vertical-list-container mt-4']/div[3]"));

		act.dragAndDrop(drag, drop).build().perform();

		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		WebElement textField = driver.findElement(By.id("userName"));

		Point location = driver.findElement(By.id("userName")).getLocation();
		int xaxis = location.getX();
		int yaxis = location.getY();

		System.out.println(xaxis);
		System.out.println(yaxis);

		act.moveToElement(textField).click().sendKeys("Abu").build().perform();

	}

}
