package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		//Mac machine system property
		//System.setProperty("webdriver.chrome.driver" ,"/Users/userName/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebDriverWait explicit_wait = new WebDriverWait(driver,10);
		
		WebElement search_box = driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		explicit_wait.until(ExpectedConditions.visibilityOf(search_box));
		search_box.sendKeys("apple");
		search_box.sendKeys(Keys.ENTER);
		
		String page_title = driver.getTitle();
		System.out.println(page_title);
		
		
		driver.close();
		
		

	}

}
