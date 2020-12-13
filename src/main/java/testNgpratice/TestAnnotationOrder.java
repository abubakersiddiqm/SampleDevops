package testNgpratice;

import org.testng.annotations.Test;

public class TestAnnotationOrder {
	
	@Test
	public void TestCase() {
		System.out.println("testcase 1");
	}

	@Test
	public void testCase() {
		System.out.println("Testcase 2");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
}
