package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//<suite name="Suite" thread-count="5" parallel="classes">   //browser parallely launch from diff classes

public class GoogleParallel1 {
	@Test
	public void a() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Aagra",Keys.ENTER);
	}

}
