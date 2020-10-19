package org.qsp.testngDemo;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class FileActiData {
		@Test(dataProviderClass =org.qsp.testngDemo.FileActi.class,dataProvider = "Read" )
		public void m1(String name,String pass)
		{
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass,Keys.ENTER);
		}

	}



