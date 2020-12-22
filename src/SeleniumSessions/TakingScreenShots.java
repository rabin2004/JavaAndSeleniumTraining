package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakingScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.name("q"));
		
		// WebDriverWait object for explicit wait
		WebDriverWait explicit_wait = new WebDriverWait(driver, 10);
		
		// wait until visibilityOf a element
		explicit_wait.until(ExpectedConditions.visibilityOf(searchField)).click();
		
		// Take screenshot and store it as a file & copy it into .png file into the path
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/User/Desktop/eclipse/JavaTraining/src/"
				+ "SeleniumSessions/screenshot1.png"));
		
		// Take screenshot then copy it into .png file into the path
		explicit_wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")))
		.getScreenshotAs((OutputType.FILE));
		
		FileUtils.copyFile(src, new File("C:/Users/User/Desktop/eclipse/JavaTraining/src/"
				+ "SeleniumSessions/screenshot2.png"));
		
		driver.close();
		driver.quit();

	}

}
