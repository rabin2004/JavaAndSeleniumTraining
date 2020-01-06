package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.ebay.com");  

		// Absolute xpath => not recommended -- 1. performance issue 2. not reliable 3. can be changed anytime in future
		// Relative xpath => recommended 
		// customizing xpath
		driver.findElement(By.xpath("//input[@label='Search for anything']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Dynamic xpath by using contains attribute
		driver.findElement(By.xpath("//input[contains(@label,'Search for')]")).clear();
		driver.findElement(By.xpath("//input[contains(@label,'Search for')]")).sendKeys("Macbook pro");
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-prim gh')]")).click();
		
		// Dynamic xpath by using starts-with
		driver.findElement(By.xpath("//input[starts-with(@label,'Search')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@label,'Search')]")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//input[starts-with(@class,'btn btn')]")).click();
		
		// Dynamic xpath by using ends-with
		//driver.findElement(By.xpath("//a[ends-with(@class,'-eb-li-a')]")).click();
		
		// Customizing xpath for linkText
		// all linkText => will have html tag <a
		driver.findElement(By.xpath("//a[contains(text(),' My eBay')]")).click();
		
	}

}
