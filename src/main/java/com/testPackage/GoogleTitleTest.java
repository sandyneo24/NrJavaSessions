package com.testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000L);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test()

	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Googlee", "Test Case is Failed");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
