package testNgpratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	
	/*
	 * Assert
	 * verify
	 * 
	 * soft assert
	 * hard assert
	 */
	
	@Test
	public void hardAssertion() {
		String s="ramya";
		Assert.assertEquals(s, "abu");
		Assert.assertNotEquals(s, "prem");
		Assert.assertEquals(s, "meena");
		Assert.assertEquals(s, "ramya");
	}
	
	public void softAssertion() {
		String s="ramya";
		SoftAssert verify=new SoftAssert();
		verify.assertEquals(s, "abu");//fail
		verify.assertEquals(s, "prem");//fail
		verify.assertEquals(s, "meena");//fail
		verify.assertEquals(s, "ramya");//pass
	}
	

}
