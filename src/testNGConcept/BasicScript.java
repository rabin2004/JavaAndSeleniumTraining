package testNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicScript {
	WebDriver driver;

	@BeforeTest(alwaysRun=true)
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
	
	@Test(priority=0, groups= {"Smoke"})
	public void getHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
	}
	
	@Test(priority=1, groups= {"Smoke", "Regression"})
	public void getLangdingUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/test/newtours/"
				+ "index.php");
	}
	
	@Test(priority=2, groups= {"Smoke", "Regression"})
	public void getSignOnPageTitle() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
	
	@Test(priority=3, groups= {"Smoke"})
	public void getRegisterPageTitle() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	}
	
}
