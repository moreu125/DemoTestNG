package CreatingTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAsseration {
   public SoftAssert softAssert =  new SoftAssert();
	@Test
	public void Test1() {
		Assert.assertEquals(true, true);
	//	Assert.assertTrue(false);
	}
	
	
	@Test
	public void Test2() {
		softAssert.assertEquals(true, true);
		softAssert.assertEquals(false, true);
		
			softAssert.assertAll();
	}
	
	@Test
	public void Test3() {
		
	}
	
}
