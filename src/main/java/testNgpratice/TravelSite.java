package testNgpratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TravelSite {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// For webDriverwait
		wait = new WebDriverWait(driver, 30);
	}

	@BeforeClass
	public void launchSite() {
		driver.get("https://www.phptravels.net/home");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	WebElement myAccount, login, userName, password, loginBtn;

	@BeforeMethod
	public void loginPage() throws InterruptedException {
		myAccount = driver.findElement(By.cssSelector("div.mini-menu>ul>li:nth-child(3)"));
		myAccount.click();

		login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		String currentPageUrl = driver.getCurrentUrl();
		Thread.sleep(4000);
		Assert.assertEquals(currentPageUrl, "https://www.phptravels.net/login");
//Enter username and password
		userName = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

		userName.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		loginBtn.click();
		Thread.sleep(3000);
	}

	List<WebElement> homeLink;

	@Test
	public void testCase1() {
		// validate the user name
		String usernameText = driver.findElement(By.cssSelector("div.mini-menu>ul>li:nth-child(3)>div>a")).getText();
		homeLink = driver.findElements(By.cssSelector("div#mobileMenuMain>nav>ul>li>a"));
		if (usernameText.equals("DEMO")) {

			System.out.println(homeLink.size());
			homeLink.get(0).click();
		}
		wait.until(ExpectedConditions.urlMatches("https://www.phptravels.net/home"));
		String homePageUrl = driver.getCurrentUrl();
		//Assert.assertEquals(homePageUrl, "https://www.phptravels.net/home");
	}

	WebElement logOut,clickMyAccount;

	@AfterMethod
	public void logOut() throws InterruptedException {
		clickMyAccount=driver.findElement(By.cssSelector("div.mini-menu>ul>li:nth-child(3)"));
		clickMyAccount.click();
		logOut = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		wait.until(ExpectedConditions.visibilityOf(logOut));
		logOut.click();
		String loginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, "https://www.phptravels.net/login");
		Thread.sleep(3000);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}