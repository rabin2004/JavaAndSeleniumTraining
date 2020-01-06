package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// PageLoadTimeout: for specific element is available in the page: giving maximum 40 seconds to perform action, if it takes more than 40 secconds to load it will throw error, if page load before 40 seconds action will be performed without waiting upto 40 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicitlyWait: global wait for all the element of the page, after page is fully loaded: maximum wait is 30 second to perform action, if found early action will be performed without waiting till 30 seconds
		
		// ExplicitWait => wait for the specific element to be loaded, once available action performed and do not wait till the mentioned time
		
		driver.get("https://www.facebook.com");

		clickOn(driver, driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")), 20); // for clickable webElement
		
		driver.navigate().back();
		
		clickOn(driver, driver.findElement(By.linkText("Create a Page")), 20); // for link webElement
	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout ) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click(); // to click the desired WebElement once it is clickable
	}
}
