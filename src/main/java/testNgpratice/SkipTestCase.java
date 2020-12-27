package testNgpratice;

import org.testng.annotations.Test;

public class SkipTestCase {
	
	@Test(enabled = false)
	public void TestCase1() {
		System.out.println("testcase 1");
	}

	@Test(priority = 2)
	public void testCase2() {
		System.out.println("Testcase 2");
	}
	@Test(priority = 1)
	public void login() {
		System.out.println("login");
	}
}
