package Learn.TestNg.TestListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;

public class MyListener implements ITestListener{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("test started....");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test success....");

	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test failure....");

	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test skipped....");

	}
	public void onFinish(ITestContext context)
	{
		System.out.println("test finish....");

	}
	

}
