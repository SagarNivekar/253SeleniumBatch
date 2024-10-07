package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public  class ListenersDemo implements ITestListener  {
	
	public void onTestStart(ITestContext context) {
		System.out.println("Test case execution is started");
	}

    @Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution is pass"+result.getMethod());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution is failed"+result.getMethod());
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
	}

	

}
