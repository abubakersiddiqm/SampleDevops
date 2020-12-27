package testNgpratice;

import org.testng.annotations.Test;

public class Groups2 {
	
	@Test(groups = "smoke")
	public void TestCase1Groups2() {
		System.out.println("TestCase1Groups2");
	}

	@Test(groups = "sainty")
	public void testCase2Groups2() {
		System.out.println("testCase2Groups2");
	}
	@Test(groups = "Regression")
	public void loginGroups2() {
		System.out.println("loginGroups2");
	}
}
