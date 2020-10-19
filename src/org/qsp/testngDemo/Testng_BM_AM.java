package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_BM_AM {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Before_M() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println("Before Method");
	}
	
	@Test
	public void TC_01() throws InterruptedException
	{
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Java",Keys.ENTER);
		System.out.println("TestCase_01");
		//Thread.sleep(1000);
		
	}
	@Test
	public void TC_02() throws InterruptedException
	{
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("python",Keys.ENTER);
		System.out.println("TestCase_02");
		
	}
	
	@AfterMethod
	public void After_M()
	{
		driver.close();
		System.out.println("After Method");
	}

}
