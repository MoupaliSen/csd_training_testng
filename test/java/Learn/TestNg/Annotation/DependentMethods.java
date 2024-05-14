package Learn.TestNg.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class DependentMethods {
	
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2 ,dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(true);

	}
	
	@Test(priority=3,dependsOnMethods= {"openApp","login"})
	void search()
	{
		Assert.assertTrue(false);

	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}

	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);

	}


}
