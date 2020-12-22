package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com");
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow "
				+ "btn-rect btn-icon btn-icon-left']")).click();
		
		driver.findElement(By.name("email")).sendKeys("rabin2004@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("SunXiang@20110611");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.xpath("//i[@class='calendar icon']")).click();
		
		String date = "15-January-2020";
		String dateArray[] = date.split("-"); // value stored as [18, January, 2020]
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		Select select = new Select(driver.findElement(By.xpath("//div[@class='rbc-day-bg']")));
		select.selectByVisibleText(day);
		
		
		
		}
}
