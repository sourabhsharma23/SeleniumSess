package JavaSeleniumPractice.SeleniumSessions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	@Test
	public void dragAndDrop() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement drop =driver.findElement(By.xpath("//*[contains(text(),'Italy')]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
	}
	
}
