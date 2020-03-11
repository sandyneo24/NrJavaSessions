package com.testPackage;

import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("Login Test");
	}
	

}
