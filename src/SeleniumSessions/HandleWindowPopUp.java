package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(4000);
		
		Set<String> handler = driver.getWindowHandles(); // Set doesn't store value in indexes like in array list
		
		Iterator<String> it = handler.iterator(); // Iterator is point at the top of the set object
		
		String ParentWindowId = it.next(); // gives first value of the set => which is Parent window ID
		System.out.println("Parent Window ID: " +ParentWindowId); 
		
		String ChildWindowId = it.next(); // gives second value of the set => which is Child window Id
		System.out.println("Child Window Id: " +ChildWindowId); 
		
		driver.switchTo().window(ChildWindowId);
		System.out.println("Child window Title:" + driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		System.out.println("Parent window Title: " +driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
	}

}
