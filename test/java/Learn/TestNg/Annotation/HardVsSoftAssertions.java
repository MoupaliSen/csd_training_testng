package Learn.TestNg.Annotation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardVsSoftAssertions {
	@Test
	void test_hardassertions()
	{
		System.out.println("testing1.....");
		System.out.println("testing2.....");
		
		Assert.assertEquals(1, 2); //if it will fail then below statement will not be executed
		
		System.out.println("hard assertions");
		
		

	}
	
	void test_softassertions()
	{
		System.out.println("testing1.....");
		System.out.println("testing2.....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s1, s2);
		
		System.out.println("soft assertions");
		
		sa.assertAll(); //mandatory
	}

}
