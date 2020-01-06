package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCOncept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");  

		//1. xpath - should not use Absolute xpath, only use Relative xpath - 2nd
		driver.findElement(By.xpath("")).sendKeys("");
		//2. id - Best if available - 1st
		driver.findElement(By.id("")).sendKeys("");
		//3. name - 3rd 
		driver.findElement(By.name("")).sendKeys("");
		//4. linkText - only for links but if id present use it
		driver.findElement(By.linkText("")).click();
		//5. partialLinkText
		driver.findElement(By.partialLinkText("")).click();
		//6. CSSSelector - #{id}-if id value is present, if class is present-.{class} - 2nd
		driver.findElement(By.cssSelector("")).click();
		//7. className - not so useful - 4th
		driver.findElement(By.className("")).sendKeys("");
		//8. tagName
		driver.findElement(By.tagName("")).sendKeys("");
	}

}
