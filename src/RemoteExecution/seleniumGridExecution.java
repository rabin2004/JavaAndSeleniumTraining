package RemoteExecution;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumGridExecution {

	public static void main(String[] args) throws MalformedURLException {
		
		// Cross-browser testing/Parallel Testing/ Cross-platform testing
		// Node and Hub - multiple nodes connected to one Hub
		

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		    capabilities.setCapability(FirefoxDriver.BINARY,new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		    
		    WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444/wd/hub"), capabilities);
	     
	     
	      
	       driver.get("http://google.com");
	       System.out.println(driver.getTitle());

	       
	       // 1. browserOptions/set Capability to browserOptions/RemoteWebDriver - send hub url & browswerOptions
	       
//	       ChromeOptions chromeOptions = new ChromeOptions();
//	       chromeOptions.setCapability("browserVersion", "74");
//	       chromeOptions.setCapability("platformName", "Windows 10");
//	       WebDriver driver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"), chromeOptions);
//	       driver.get("http://www.google.com");
//	       driver.quit();
	       
//	       FirefoxOptions firefoxOptions = new FirefoxOptions();
//	       WebDriver driver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"), firefoxOptions);
//	       driver.get("http://www.google.com");
//	       driver.quit();

	}

}
