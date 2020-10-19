package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bluestone2Am_Bm {
	WebDriver driver;
	@BeforeMethod
	public void Before_M() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		System.out.println("Execution Start");	
	}
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		System.out.println("Login Done");
	}
    @Test
    public void TryAtHome() throws InterruptedException
    {
    	driver.findElement(By.xpath("//a[@class='tah-a-l']")).click();
    	Thread.sleep(8000);
    	WebElement tele=driver.findElement(By.id("tahLpPhone"));
    	tele.sendKeys("7834526789",Keys.ENTER);
        WebElement mail=driver.findElement(By.id("tahLpEmail"));
        mail.sendKeys("abc24@gmail.com",Keys.ENTER);
    	Thread.sleep(2000);
    	System.out.println("Try At Home done");
    }
    @AfterMethod
    public void After_M()
    {
    	driver.close();
    	System.out.println("Execution Done");
    }
}
