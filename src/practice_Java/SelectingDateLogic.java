package practice_Java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectingDateLogic {
	static WebDriver driver;
	static String month = "May";
	static String day = "12";
	
//	public static void selectingDepartingDate(String month, String day) {
//		WebElement desiredMonth = driver.findElement(By.xpath("//h2[contains(text(),"+month+")]"));
//		if(desiredMonth.isDisplayed()) {
//			WebElement desiredMonthTable = driver.findElement(By.xpath
//					("//h2[contains(text(),"+month+")]/following-sibling::table/tbody"));
//			Actions action = new Actions((WebDriver) desiredMonthTable);
//			action.moveToElement(driver.findElement(By.xpath("//td/button[@data-day='"+day+"']")))
//			.click().build().perform();
//		}
//		
//	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.expedia.com/");  
		WebElement departingDate = driver.findElement(By.xpath("//button[@id='d1-btn']/parent::div"));
		departingDate.click();
//		WebElement desiredMonth = driver.findElement(By.xpath("//h2[contains(text(),"+month+")]"));
		WebElement desiredMonthTable = driver.findElement(By.xpath
					("//h2[contains(text(),"+month+")]/following-sibling::table/tbody"));
			for(int i=1; i<=5;i++) {
				for(int j=1; j<=7; j++) {
					WebElement desiredSelection = desiredMonthTable.findElement(By.xpath("//tr["+i+"]/td["+j+"]/button"));
					System.out.println(desiredSelection.getText());
//					if(desiredSelection.getText().equals(day)) {
//						desiredSelection.click();
//					}
				}
			}
	}

}
