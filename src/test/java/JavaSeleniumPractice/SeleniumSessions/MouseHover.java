package JavaSeleniumPractice.SeleniumSessions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	@Test
	public void MouseHoverAction() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktops =driver.findElement(By.xpath("(//a[contains(@class,'dropdown-toggle')])[2]"));
		WebElement macs =driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktops).moveToElement(macs).click().build().perform();
		
	}
	
	
}
