package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void LoginTest() {
		System.out.println("Login test");
		int i = 9/0;
	}
	
	@Test (dependsOnMethods="LoginTest") // dependsOnMethods => HomePageTest depends on LoginTest, 
	//so if the LoginPageTest gets passed then only HomePageTest will execute, if not it won't, it will be skipped
	public void HomePageTest() {
		System.out.println("HomePage test");
	}
	
	@Test (dependsOnMethods = "LoginTest")
	public void SearchPageTest() {
		System.out.println("Search test");
	}
	
	@Test (dependsOnMethods = "LoginTest")
	public void RegPageTest() {
		System.out.println("Registration test");
	}
}
