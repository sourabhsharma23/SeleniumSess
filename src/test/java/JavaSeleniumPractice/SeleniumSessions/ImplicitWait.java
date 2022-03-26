package JavaSeleniumPractice.SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.safaridriver().setup();
		System.setProperty("webdriver.chrome.driver","/Users/labuser/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//h3[text()='WebDriver - Selenium.dev']")).click();
		
		driver.quit();
	}

}
