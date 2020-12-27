package testNgpratice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Priority {
	
	@Test
	public void TestCase1() {
		System.out.println("testcase 1");
	}

	@Test(priority = 2,timeOut = 1000)
	public void testCase2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Testcase 2");
	}
	@Test(priority = 1,invocationCount = 2)
	public void login() {
		System.out.println("login");
	}
}
