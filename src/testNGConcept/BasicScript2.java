package testNGConcept;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicScript2 {
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
	public void getSupportPageTitle() throws IOException {
		driver.findElement(By.linkText("SUPPORT")).click();
		
		// to take screenshot of an element
//		File src = driver.findElement(By.linkText("SUPPORT")).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C:/Users/User/Desktop/eclipse/JavaTraining/src/testNGConcept/test1.png"));
		Assert.assertEquals(driver.getTitle(), "Under Construction: Mercury Tours");
	}
	
	@Test(priority=1, groups= {"Smoke", "Regression"})
	public void getContactPageTitle() {
		driver.findElement(By.linkText("CONTACT")).click();
		Assert.assertEquals(driver.getTitle(), "Under Construction: Mercury Tours");
	}
}
