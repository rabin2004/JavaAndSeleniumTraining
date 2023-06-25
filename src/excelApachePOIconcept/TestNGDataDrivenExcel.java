package excelApachePOIconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDataDrivenExcel {
	WebDriver driver;

	@BeforeMethod()
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.close();
	}
	
	@Test(dataProviderClass=excelApachePOIconcept.DataProviderExcel.class, dataProvider="dataDrivenData")
	public void multipleUserSignOn(String UserName, String Password) {
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(UserName);
		password.sendKeys(Password);
		driver.findElement(By.name("submit")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")
				).getText(), "Login Successfully");
	}
}
