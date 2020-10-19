package org.qsp.testngDemo;

import org.testng.annotations.Test;

public class Invocation_testng {

	@Test(invocationCount = 5)
	public void Test1()
	{
		System.out.println("Test_Case_01");
	}
}
