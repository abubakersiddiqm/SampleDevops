package basicproject;

import org.testng.annotations.Test;
import pages.ParticeFormTC001;

public class TestCase01 {
	@Test
	public void testc001() {
		try {
			new ParticeFormTC001().tc001();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
