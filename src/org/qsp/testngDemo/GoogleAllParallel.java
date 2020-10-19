package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//<suite name="Suite" thread-count="5" parallel="methods">--------for all methods or all browser parallely launch in one prog
public class GoogleAllParallel {
	@Test
	public void a() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Python",Keys.ENTER);
	}
	@Test
	public void b() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("SQL",Keys.ENTER);
	}
	@Test
	public void c() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("HTML",Keys.ENTER);
	}

}
