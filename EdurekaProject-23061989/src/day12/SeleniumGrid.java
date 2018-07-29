package day12;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String nodeUrl;

		nodeUrl = "http://192.168.0.2:5555/wd/hub";
		
		//Anything other than chrome browser
	//	DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");

		driver = new RemoteWebDriver(new URL(nodeUrl), options);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://qatechhub.com");

	}

}
