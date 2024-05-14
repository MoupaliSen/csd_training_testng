package Learn.TestNg.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite");

	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test");

	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is after test");

	}
	
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class method.....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class method.....");
	}
	
}
