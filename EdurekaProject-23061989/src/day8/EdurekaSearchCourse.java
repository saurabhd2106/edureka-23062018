package day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.WaitUtils;

public class EdurekaSearchCourse {

	public WebDriver driver;

	String url = "https://www.edureka.co/";
	
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

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.edureka.co/");
	}

	public void LoginToEdureka() {

		driver.findElement(By.linkText("Log In")).click();

		WebElement enterEmail = driver
				.findElement(By.xpath("//form[@id= 'signinForm']/div[2]/input[@id = 'inputName']"));

		enterEmail.sendKeys("abhi.voyage@gmail.com");

		driver.findElement(By.id("pwd1")).sendKeys("enigmade1");

		driver.findElement(By.xpath("(//button[@type= 'submit'])[4]")).click();

	}
	
	public void SearchForCourse(String course) throws InterruptedException, AWTException {

		Thread.sleep(5000);

		driver.findElement(By.id("homeSearchBar")).sendKeys(course);

		Robot action = new Robot();

		action.delay(5000);

		action.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.className("cardmain")).click();

	
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		driver.navigate().back();

		

		driver.findElement(By.xpath("(//div[@id= 'mCSB_4_container']/li/a)[1]")).click();

	}

}
