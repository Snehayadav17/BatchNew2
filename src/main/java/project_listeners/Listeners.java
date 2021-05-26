package project_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is Success");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is Skipped");
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Start");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Finish");
	}
}
		