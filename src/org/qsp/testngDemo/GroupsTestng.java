package org.qsp.testngDemo;

import org.testng.annotations.Test;

public class GroupsTestng {
	
	@Test(groups = "functional",dependsOnGroups = "acceptance")
	public void TC_01()
	{
		System.out.println("TC1");
	}
	@Test(groups = "acceptance",dependsOnGroups = "smoke")
	public void TC_02()
	{
		System.out.println("TC2");
	}
	@Test(groups = "smoke")
	public void TC_03()
	{
		System.out.println("TC3");
	}
	@Test(groups = "functional",dependsOnGroups = "acceptance")
	public void TC_04()
	{
		System.out.println("TC4");
	}
	@Test(groups = "smoke")
	public void TC_05()
	{
		System.out.println("TC5");
	}

}
