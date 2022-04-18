package JavaSeleniumPractice.SeleniumSessions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClickAction {

	@Test
	public void mouseRight() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		WebElement doubleele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		//Single click
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
		
		//Double Click
		act.doubleClick(doubleele).perform();
		
	}
	
	
}
