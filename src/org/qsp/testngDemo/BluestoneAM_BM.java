package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BluestoneAM_BM {
	
	WebDriver driver;
	@BeforeMethod
	public void B_Method() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		System.out.println("Execution Start");
	}
	@Test
	public void Locate() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(.,'Locate')]")).click();
		Thread.sleep(1000);
		System.out.println("Locate Store");
	}
	@Test
	public void Plan() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Plan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc24@gmail.com",Keys.ENTER);
		System.out.println("Monthly Plan");
	}
	@AfterMethod
	public void A_Method()
	{
		System.out.println("Execution Done....");
		driver.close();
	}
}
