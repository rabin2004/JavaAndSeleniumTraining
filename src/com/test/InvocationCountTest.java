package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test (invocationCount=10) // invocationCount => will executed test 10 times
	public void sum() {
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("Sum is****" +c);
	}
}
