package org.qsp.testngDemo;

import org.testng.annotations.Test;

public class DependsOnMethod_testng {

	@Test(dependsOnMethods = "Test3" )
	public void Test1()
	{
		System.out.println("Test case 01");    //Depend on Test 3
	}
	
	@Test()
	public void Test2()
	{
		System.out.println("Test case 02");       // 1ST EXECUTED
	}
	
	@Test(dependsOnMethods = "Test2")
	public void Test3()
	{
		System.out.println("Test case 03");      //DEPEND ON TSET 2
	}
}



//OP
//PASSED: Test2
//PASSED: Test3
//PASSED: Test1