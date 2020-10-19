package org.qsp.testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_testng {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suit");
	}
    @BeforeTest
    public void bt()
    {
    	System.out.println("Before Test");	
    }
    @BeforeClass
    public void bc()
    {
    	System.out.println("Before Class");
    }
    @BeforeMethod
    public void BM()
    {
    	System.out.println("Before Method");
    }
    @Test
    public void TestC1()
    {
    	System.out.println("Test_01");
    }
    @Test
    public void TestC2()
    {
    	System.out.println("Test_02");
    }
    @AfterMethod
    public void Am()
    {
    	System.out.println("After Method");
    }
    @AfterClass
    public void Ac()
    {
    	System.out.println("After Class");
    }
    @AfterTest
    public void At()
    {
    	System.out.println("After Test");
    }
    @AfterSuite
    public void As()
    {
    	System.out.println("After Suit");
    }
}
