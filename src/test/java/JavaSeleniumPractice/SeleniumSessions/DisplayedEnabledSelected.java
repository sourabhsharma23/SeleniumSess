package JavaSeleniumPractice.SeleniumSessions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(utility.MyListener.class)
public class DisplayedEnabledSelected {

	@Test
	public void displayedEnabledSelectedTest() {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/labuser/Downloads/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			
			System.out.println("Verification Successful – Correct title is displayed on the home webpage.");
		}
		else {
			System.out.println("Verification Failed: Incorrect title is displayed on the home webpage.");
		}
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
		
		if(searchBox.isEnabled()) {
			System.out.println("Sesrch box is enabled" +searchBox.isEnabled());
		}else
		{
			System.out.println("Search box is disabled. Return: " +searchBox.isEnabled()); 
		}
		WebElement searchButton = driver.findElement(By.xpath("//input[@class='gNO89b']")); 
		
		if(searchButton.isDisplayed()) {
			System.out.println("Sesrch button is displayed" +searchButton.isDisplayed());
		}else
		{
			System.out.println("Sesrch button is not displayed" +searchButton.isDisplayed());
		}
			
		driver.quit();
	}
	
}
