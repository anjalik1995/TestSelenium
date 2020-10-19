package org.qsp.testngDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DateTimeDemo implements ITestListener {
	
	@Override
	public void onFinish(ITestContext,iTestContext)
	{
		System.out.println(iTestContext.getEndDate());
	}
}

	/*@Override
	public void onTestStart(ITestResult,iTestResult)
	{
		System.out.println(iTestResult.getName());
		System.out.println(iTestResult.getStatus());
	}*/
	
	
	

