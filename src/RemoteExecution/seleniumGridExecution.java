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


	}

}
