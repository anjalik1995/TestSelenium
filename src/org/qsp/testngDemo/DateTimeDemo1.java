package org.qsp.testngDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.qsp.testngDemo.DateTimeDemo.class)
public class DateTimeDemo1 {
@Test
public void m()
{
	System.out.println("Hiii");
}
@Test
public void m1()
{
	System.out.println("GoodEvening");
	Assert.fail();
}
}
