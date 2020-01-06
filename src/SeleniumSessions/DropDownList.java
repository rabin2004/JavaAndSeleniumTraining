package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");  
		
		//handle drop down
		
		Select select=new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("UNITED KINGDOM");
		
		select.selectByVisibleText("UNITED STATES");
		
		select.selectByVisibleText("AUSTRALIA");

	}

}
