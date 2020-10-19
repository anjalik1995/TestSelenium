package org.qsp.testngDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestoneTestng2 {
	@Test
	public void Bluestone_Rings() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		WebElement Rings=driver.findElement(By.xpath("//a[@title='Rings']//parent::li[@class='menuparent repb']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Rings).perform();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]/parent::a[@id='pid_41483']")).click();
		
		Set<String> wins=driver.getWindowHandles();
		
		for (String win : wins) {
			driver.switchTo().window(win);
			
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());
		
		driver.close();

		
	}

}
