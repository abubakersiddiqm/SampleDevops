package testNgpratice;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = {"login"},priority = 2)
	public void testcase1() {
		System.out.println("Ticketbooking");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = "testcase1",priority = 1)
	public void logOut() {
		System.out.println("logOut");
	}

}
