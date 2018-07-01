package day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

		// /n -- new line, /t-- tab
		driver = new ChromeDriver();

		Dimension dim = new Dimension(400, 600);

		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://qatechhub.com");
	}
	
	public String getTitleOfThePage(){
		return driver.getTitle();
	}
	
	public String getPageCurrentUrl(){
		return driver.getCurrentUrl();
	}
	
	public void navigateCommands(){
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
