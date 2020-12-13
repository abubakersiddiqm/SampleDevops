package testNgpratice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOrderForbeforeandAftermethod {
	@BeforeMethod
	public void login() {
      System.out.println("login");
	}

	@Test
	public void TestCase1() {
		System.out.println("testcase 1");
	}

	@Test
	public void TestCase2() {
		System.out.println("Testcase 2");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("logout");
	}

}
