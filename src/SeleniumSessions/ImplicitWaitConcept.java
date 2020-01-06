package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Implicit Wait => dynamic wait, used on application where pages take time to load
public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ebay.com");  
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // PageLoadTimeout: for specific element is available in the page: giving maximum 40 seconds to perform action, if it takes more than 40 secconds to load it will throw error, if page load before 40 seconds action will be performed without waiting upto 40 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicitlyWait: global wait for all the element of the page, after page is fully loaded: maximum wait is 30 second to perform action, if found early action will be performed without waiting till 30 seconds
		Thread.sleep(4000); // static wait: will wait 4 seconds though element is found is found early
		
	}

}
