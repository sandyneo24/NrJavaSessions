package com.testPackage;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=10)
	public void sum()
	{
		int i=10;
		int j=10;
		int k=i+j;
		System.out.println("Sum is :"+k);
	}

}
