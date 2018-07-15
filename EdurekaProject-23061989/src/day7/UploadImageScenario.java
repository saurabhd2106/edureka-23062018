package day7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImageScenario {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://images.google.com");

		driver.findElement(By.id("qbi")).click();
		
		driver.findElement(By.linkText("Upload an image")).click();
		
		driver.findElement(By.id("qbfile")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Saurabh Dhingra\\workspace_git\\EdurekaProject23062018\\EdurekaProject-23061989\\scripts\\uploadImage.exe");

		
	}

}
