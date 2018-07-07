package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver36/chromedriver.exe");

		driver = new ChromeDriver();
		try {

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.get("https://jqueryui.com/droppable/");

			WebElement frameLink = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(frameLink);

			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));

			Actions action = new Actions(driver);

			action.dragAndDrop(source, target).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			driver.quit();

		}

	}

}
