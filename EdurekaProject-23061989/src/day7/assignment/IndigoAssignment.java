package day7.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IndigoAssignment {

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

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.goindigo.in/");
	}
	
	public void bookFlight(){
		driver.findElement(By.xpath("//form[@class='flight-booking-way one-way-form']//input[@class='origins-value city-name-value']")).click();
		
		driver.findElement(By.xpath("//form[@class='flight-booking-way one-way-form']//a[contains(text(),'NAG')]")).click();
		
		driver.findElement(By.xpath("//form[@class='flight-booking-way one-way-form']//input[@class='destinations-value city-name-value']")).click();
		
		driver.findElement(By.xpath("(//form[@class='flight-booking-way one-way-form']//a[contains(text(),'JAI')])[2]")).click();
		
		Select adultSel= new Select(driver.findElement(By.xpath("//select[@name='indiGoOneWaySearch.PassengerCounts[0].Count']")));
		Select childSel= new Select(driver.findElement(By.xpath("//select[@name='indiGoOneWaySearch.PassengerCounts[1].Count']")));
		Select infantSel= new Select(driver.findElement(By.xpath("//select[@name='indiGoOneWaySearch.InfantCount']")));
		adultSel.selectByVisibleText("3");
		childSel.selectByVisibleText("2");
		infantSel.selectByVisibleText("0");
		
	}

}
