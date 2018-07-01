package day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {

	WebDriver driver;

	public void invokeBrowser(String browserType) {

		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

			// /n -- new line, /t-- tab
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			// /n -- new line, /t-- tab
			driver = new EdgeDriver();
		} else {
			System.err.println("Invalid Browser");
		}

		Dimension dim = new Dimension(400, 600);

		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://qatechhub.com");
	}

	public String getTitleOfThePage() {
		return driver.getTitle();
	}

	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void navigateCommands() {
		driver.navigate().to("http://facebook.com");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();
	}

	public void closeBrowser() {

		// Closes only current active window
		// driver.close();

		// Close all the windows
		driver.quit();
	}

}
