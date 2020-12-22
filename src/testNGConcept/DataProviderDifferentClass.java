package testNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderDifferentClass {

	WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
	
	// if DataProvider in separate class need to to provide dataProviderClass=className.class
	@Test(priority=0, dataProvider="SignOnData", dataProviderClass=DataProviderDatas.class)
	public void multipleUserSignOn(String UserName, String Password) {
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(UserName);
		password.sendKeys(Password);
		driver.findElement(By.name("submit")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")
				).getText(), "Login Successfully");
	}
	
	@Test(priority=1, dataProvider="RegisterData", dataProviderClass=DataProviderDatas.class)
	public void multipleUserRegistration(String Username, String Password) {
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		username.sendKeys(Username);
		password.sendKeys(Password);
		confirmPassword.sendKeys(Password);
		driver.findElement(By.name("submit")).click();
		String actualRegisteredMsg = driver.findElement(By.xpath("//table[@width='492']/"
				+ "tbody/tr[3]/td/p[3]")).getText();
		String expectedRegisteredMsg = "Note: Your user name is "+Username+".";
		Assert.assertEquals(actualRegisteredMsg, expectedRegisteredMsg);
	}
}
