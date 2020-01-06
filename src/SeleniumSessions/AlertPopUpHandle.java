package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // to delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // PageLoadTimeout wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicitlyWait
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  
		
		driver.findElement(By.name("proceed")).submit();
		
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert(); // use alert API by using switchTo method
		
		System.out.println(alert.getText()); // to print the txt from alert box
		
		String text = alert.getText();
		
		// validation of alert testing
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert msg");
		}
		
		else{
			System.out.println("Incorrect alert msg");
		}
		
		alert.accept(); // click on ok button
		// alert.dismiss(); -- if cancel button is available

	}

}
