package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");

	}

}
