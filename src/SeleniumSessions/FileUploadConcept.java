package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");  

		// file upload popUp
		
		driver.findElement(By.name("fileupload")).sendKeys("C:/Users/User/Desktop/SQL practice.txt"); // to select file from PC, give location for the file within in sendKeys
		
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/input[2]")).click(); // to upload
	}

}
