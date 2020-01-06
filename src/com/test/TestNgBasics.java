package com.test;

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

	// annotation starts with @ - every annotation should have method
	// @Before - pre-requisite/pre-condition annotation
	// will following sequence
	/* @BeforeMethod
	 * @Test -1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test -2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test -2
	 * @AfterMethod
	 * 
	 * so on
	 */
	
	@BeforeSuite // first
	public void setUp() {
		System.out.println("BeforeSuite---setup system property for chrome");
	}
	
	@BeforeTest // second
	public void launchBrowser() {
		System.out.println("BeforeTest--launch Chrome Browser");
	}
	
	@BeforeClass //third
	public void enterURL() {
		System.out.println("BeforeClass---enter URL");
	}
	
	@BeforeMethod //fourth
	public void login() {
		System.out.println("BeforeMethod---login to the app");
	}

	//test cases - starting with @Test
	@Test //fifth
	public void googleTitleTest() {
		System.out.println("Test---Google Title Test-1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test---Test 2");
	}
	
	// @After - post-condition annotations
	@AfterMethod //sixth
	public void logOut() {
		System.out.println("AfterMethod---Logout from app");
	}
	
	@AfterClass //seventh
	public void deleteAllCookies() {
		System.out.println("AfterClass---delete all cookies");
	}
	
	@AfterTest //eighth
	public void closeBrowser() {
		System.out.println("AfterTest---close browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("AfterSuite---generate test report");
	}
	
	
	
}
