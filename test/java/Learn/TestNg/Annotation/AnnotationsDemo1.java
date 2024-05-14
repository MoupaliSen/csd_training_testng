package Learn.TestNg.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@BeforeClass
	void login()
	{
		System.out.println("Login...");
	}
	@Test
	void search()
	{
		System.out.println("Search...");
	
	}

	@Test
	void advancedSearch()
	{
		System.out.println("Advanced Search...");
	
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("logout...");

	}
}
