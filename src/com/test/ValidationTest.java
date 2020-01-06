package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidationTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "is not the correct title"); // Assert => to check validation of the test result, if actual=expected message is not going to be printed
	
		//Assert.assertEquals(title, "Facebook", "is not the correct title"); //Assert => if actual not= expected, message will be printed
	}
	
	@Test ()
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		
		Assert.assertTrue(b); // b=true - assertion will pass, if b=false - assertion will fail
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
