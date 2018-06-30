package day3.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

		// /n -- new line, /t-- tab
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://qatechhub.com");
	}

	public void closeBrowser() {

		// Closes only current active window
		// driver.close();

		// Close all the windows
		driver.quit();
	}

}
