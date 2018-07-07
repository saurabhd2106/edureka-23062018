package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");
		
		//Switching back from a frame
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		//alert.dismiss();
	}

}
