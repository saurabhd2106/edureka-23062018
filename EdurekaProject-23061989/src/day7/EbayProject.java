package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EbayProject {

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

		driver.get("http://www.ebay.in");
	}

	public void getLinkCount() {
		List<WebElement> allLink = driver.findElements(By.tagName("a"));

		System.out.println(allLink.size());
	}

	public void getUrlFromALink() {
		WebElement mobileAndAccessories = driver.findElement(By.linkText("Mobile & Accessories"));

		System.out.println(mobileAndAccessories.getAttribute("href"));

	}

	public void getAllLinks() {
		List<WebElement> allLink = driver.findElements(By.tagName("a"));

		for (WebElement link : allLink) {
			System.out.println("Link Text :: " + link.getText() + " and its attribute :: " + link.getAttribute("href"));
		}
	}

	public String searchProduct(String product, String category) {

		driver.findElement(By.id("gh-ac")).sendKeys(product);

		Select dropdown = new Select(driver.findElement(By.id("gh-cat")));

		dropdown.selectByVisibleText(category);

		driver.findElement(By.id("gh-btn")).click();

		return driver.findElement(By.className("listingscnt")).getText();
	}

	public void getNthProduct(int itemNumber) {

		String xpathExpression = String.format("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li[%d]",
				itemNumber);

		String nthProduct = driver.findElement(By.xpath(xpathExpression)).getText();

		System.out.println(nthProduct);
	}

	public void getAllProducts() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));

		for (WebElement product : allProducts) {
			System.out.println("--------------------------------------");

			System.out.println(product.getText());

		}

	}
	
	public void getAllProductsViaJS() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));

		int x, y;
		
		
		
		for (WebElement product : allProducts) {
			System.out.println("--------------------------------------");

			x = product.getLocation().x;
			
			y = product.getLocation().y;
			
			scrollBy(x, y);
			
			System.out.println(product.getText());

		}

	}
	
	private void scrollBy(int x, int y){
		JavascriptExecutor jsEngine;
		
		String jsCommand = String.format("window.scrollBy(%d,%d)", x,y);
		
		jsEngine = (JavascriptExecutor) driver;
		
		jsEngine.executeScript(jsCommand);
	}
	
	public void getAllProductsWithScrollDown() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));

		Actions action = new Actions(driver);
		
		for (WebElement product : allProducts) {
			
			action.moveToElement(product).build().perform();
			System.out.println("--------------------------------------");

			System.out.println(product.getText());

		}

	}
}
