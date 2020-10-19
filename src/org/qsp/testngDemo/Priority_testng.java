package org.qsp.testngDemo;

import org.testng.annotations.Test;

public class Priority_testng {
 
	@Test(priority = 2)
	public void Test1()
	{
		System.out.println("Test case 03");    //executed 2nd
	}
	@Test(priority = 3)
	public void Test2()
	{
		System.out.println("Test case 02");       // executed last
	}
	@Test(priority = -1)
	public void Test3()
	{
		System.out.println("Test case 01");      //execute 1st
	}
}
