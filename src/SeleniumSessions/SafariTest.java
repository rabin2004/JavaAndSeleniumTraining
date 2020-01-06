package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver(); // no need system.setProperty
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

	}

}
