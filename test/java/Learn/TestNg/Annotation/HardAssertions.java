package Learn.TestNg.Annotation;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertions {
	@Test
	void test() {
		int x=10;
		int y=15;
		
//		if(x==y)
//		{
//			System.out.println("test Passed");
//		}
//		else
//		{
//			System.out.println("test failed");
//	
//		}
		
		//Assert.assertEquals(x, y);
		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(false);  //pass
		
		int a=10;
		int b=20;
		//Assert.assertEquals(actual expected, expected description);
		//Assert.assertEquals(a>b, true);
		
		String s1= "abc";
		String s2 ="abc1";
		
		//Assert.assertEquals(s1, s2,"Strings are not equals");  //pass
		//Assert.assertEquals(s1, s2); //fail
		
		if(true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}

	}

}
