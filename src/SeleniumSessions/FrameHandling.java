package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://freecrm.com");  
		driver.get("http://the-internet.herokuapp.com/");
		
		/*driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.name("email")).sendKeys("rabin2004@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Laxmi@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//driver.switchTo().frame("mainpanel"); // to switchTo the frame
		
		List<WebElement> iframes=driver.findElements(By.xpath("//iframe")); // to get the number of frame
		System.out.println(iframes.size());
		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span/Contacts")).click();*/
		
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		List<WebElement> iframes=driver.findElements(By.xpath("//iframe")); 
		System.out.println(iframes.size());
		driver.switchTo().frame("/frame_bottom");
		
		
	}

}
