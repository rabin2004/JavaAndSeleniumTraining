package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.ebay.com");  
		
		//get the total count of links of the page
		//get the txt of each link of the pages
		
		List<WebElement> ListOfLinks=driver.findElements(By.tagName("a"));
		
		//size of listOfLinks
		System.out.println(ListOfLinks.size());
		
		//get the txt of all the links
		for(int i=0;i<ListOfLinks.size(); i++) {
			String NameOfLinks = ListOfLinks.get(i).getText();
			System.out.println(NameOfLinks);
			
		}
		
	}

}
