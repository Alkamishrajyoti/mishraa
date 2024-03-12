package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("exec started");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("tc passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("tc failed");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("tc skipped");
	}
}
