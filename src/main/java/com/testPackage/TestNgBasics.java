package com.testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//OutPut
	/*
	Setup system property for chrome
	Login Method
	Launch Chrome Browser
	Enter URL
	Google Title Test
	Logout from app
	closeBrowser
	deleteAllCookies */




	// Pre Conditions--- Starting with @Before
	@BeforeSuite
	public void setUp()  //1st
	{
		System.out.println("Setup system property for chrome");
	}

	@BeforeTest //2nd
	public void launchBrowser()
	{
		System.out.println("Launch Chrome Browser");
	}

	@BeforeClass//3rd
	public void login()
	{
		System.out.println("Login Method");
	}

	@BeforeMethod

	public void enterURL()//4th
	{
		System.out.println("Enter URL");
	}

	//These are Tests-- Starting with @Test
	@Test
	public void googleTitleTest()//5th
	{
		System.out.println("Google Title Test");
	}

	//Post Conditions--- Starts with @After

	@AfterMethod
	public void logout()//6th
	{
		System.out.println("Logout from app");
	}

	@AfterClass
	public void closeBrowser()//7th
	{
		System.out.println("closeBrowser");
	}

	@AfterTest
	public void deleteAllCookies()//8th
	{
		System.out.println("deleteAllCookies");		
	}


	@AfterSuite
	public void generateReport()
	{
		System.out.println("Generate Test Reports");
	}


}
