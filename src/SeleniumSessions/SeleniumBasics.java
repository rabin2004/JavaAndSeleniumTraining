package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
	
		//1. Firefox Browser
		//geckodriver -> class in selenium
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver(); // WebDriver=Interface, driver is object name -- create object of Firefox driver

		
		//2. Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");  // enter url
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if (Title.equals("Google")) { //Validation Point -> compare actual vs expected
			System.out.println("Correct Title");
		}
		
		else {
			System.out.println("In-correct Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		
		//driver.quit(); // to close browser
		}

}
