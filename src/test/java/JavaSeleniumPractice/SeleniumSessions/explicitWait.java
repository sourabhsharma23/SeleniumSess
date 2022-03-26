package JavaSeleniumPractice.SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/labuser/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");	
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By loc = By.xpath("//h3[text()='WebDriver - Selenium.dev']");
		
		waitForPresence(driver,loc,10).click();
		
		driver.quit();
		
	}

	public static WebElement waitForPresence(WebDriver driver, By locator, int timeout) {
		WebDriverWait mywait = new WebDriverWait(driver, timeout);
		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
		return driver.findElement(locator);
		
	}
	
	
}
