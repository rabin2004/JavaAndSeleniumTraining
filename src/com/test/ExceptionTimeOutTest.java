package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	/*@Test(invocationTimeOut=2000) // invocationTimeOut => to stop infinite loop from the test, so rest of the test can be executed
	public void infiniteLoopTest() { 
		int i = 1;
		while (i==1) {
			
		System.out.println(i);
		}
	}
	*/
	
	@Test (expectedExceptions = NumberFormatException.class) // expectedExceptions => is to avoid test from failing if Exception is being expected
	public void expectedException() {
		
		String i = "200B";
		
		Integer.parseInt(i);
		
		System.out.println(i);
	}
}
