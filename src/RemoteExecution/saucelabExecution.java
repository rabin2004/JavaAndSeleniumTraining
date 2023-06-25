package RemoteExecution;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabExecution {
	 public static final String USERNAME = "rabin2004_2005";
	  public static final String ACCESS_KEY = "0c6fed55-ec87-4a5b-9439-6a232a5c9c3a";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		dc.setCapability("platformName", "Windows 10");
		dc.setCapability("browserVersion", "83.0");
		
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());

		driver.quit();
		
		
//		MutableCapabilities sauceOptions = new MutableCapabilities();
//
//		EdgeOptions browserOptions = new EdgeOptions();
//		browserOptions.setCapability("platformName", "macOS 10.13");
//		browserOptions.setCapability("browserVersion", "latest");
//		browserOptions.setCapability("sauce:options", sauceOptions);
		
//		MutableCapabilities sauceOptions = new MutableCapabilities();
//		sauceOptions.setCapability("screenResolution", "1024x768");
//
//		InternetExplorerOptions browserOptions = new InternetExplorerOptions();
//		browserOptions.setCapability("platformName", "Windows 7");
//		browserOptions.setCapability("browserVersion", "9.0");
//		browserOptions.setCapability("sauce:options", sauceOptions);
	}

}
