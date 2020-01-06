package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class ReadPropertyFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		// information in config.property is converted into stream
		FileInputStream ip = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse\\JavaTraining\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip); // to load values from config.property
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("Name")); // Name property is not available
		
		String URL = prop.getProperty("url"); // to read property from the config.property file
		
		System.out.println(URL);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(URL); // launch the url
		
		// to use data and object repository from config.property into the test script, preventing the hard coated value
		
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(prop.getProperty("signin_button"))).click();
	}

}
