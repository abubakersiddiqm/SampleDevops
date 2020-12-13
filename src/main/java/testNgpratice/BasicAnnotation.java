package testNgpratice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("before suite :Enivornment setup");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest: Test data file open and fetch data ,enivornmnt");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass: new Classname() ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod:  login ");
	}
	@Test
	public void test() {
		System.out.println("sendkeyes ,pages ,aqpa doc");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("Aftermethod:  logOut ");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass: reports for the runned testcases");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest: Test data file close ");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("After suite");
	}
}
