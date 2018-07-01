package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {

	FirefoxDriver driver;

	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

		// /n -- new line, /t-- tab
		driver = new FirefoxDriver();

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
