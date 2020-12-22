package testNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParametrization {
	WebDriver driver;

	@BeforeTest(alwaysRun=true)
	@Parameters({"browser"})
	public void initialization(String browser) {
		
		//Cross browser testing
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("internetExplorer")) {
			System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		else {
			System.out.println("Browser not available");
		}
		
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
	
	@Test
	@Parameters({"username","password"}) // pass @Parameters annotations
	public void signIn(String username, String password) { // pass argument in the method
		
		WebElement user_name = driver.findElement(By.name("userName"));
		WebElement Password = driver.findElement(By.name("password"));
		
		user_name.sendKeys(username);
		Password.sendKeys(password);
		
		driver.findElement(By.name("submit")).click();
		
		String loginSuccessfulmsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		Assert.assertEquals(loginSuccessfulmsg, "Login Successfully");
		
		driver.findElement(By.linkText("Home")).click();
	}
	

}
