package testNgpratice;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "smoke")
	public void TestCase1() {
		System.out.println("testcase 1");
	}

	@Test(groups = "sainty")
	public void testCase2() {
		System.out.println("Testcase 2");
	}
	@Test(groups = "Regression")
	public void login() {
		System.out.println("login");
	}
}
