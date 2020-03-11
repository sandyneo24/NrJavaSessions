package com.testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test(priority=1, groups="Title")

	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}	

	@Test(priority=2)
	public void logoTest()
	{
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}

	@Test(priority=3 ,groups="Title")
	public void maillinkText()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=6,groups="Test")
	public void test3()
	{

		System.out.println("Test3");
	}

}
