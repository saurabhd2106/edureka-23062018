package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {

	WebDriver driver;

	@Parameters("browserType")
	@BeforeClass
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

		driver.get("http://demo.guru99.com/v4");
	}

	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
	@Test(priority=0)
	public void verifyTheTitleOfLoginPage(){
		String expectedTitle = "Guru99 Bank Home Page";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Parameters({"userid","password"})
	@Test(priority=100)
	public void login(String userId, String password){
		WebElement username = driver.findElement(By.name("uid"));
		username.sendKeys(userId);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();
	}
	
}
