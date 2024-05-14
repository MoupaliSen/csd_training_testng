package Learn.TestNg.Annotation.classes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	void xyz()
	{
		System.out.println("xyz class");
	}

	@AfterTest
	void n()
	{
		System.out.println("this is after test methods ");
	}
}
