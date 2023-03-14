package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Example1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
    System.out.println("test failed"); 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("passpercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("test finished");
	}
	

}
