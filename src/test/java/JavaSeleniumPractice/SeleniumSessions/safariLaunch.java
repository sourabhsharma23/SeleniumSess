package JavaSeleniumPractice.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safariLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		
//		driver.get("http://automationpractice.com/index.php");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Page Title: " + driver.getTitle());
		
//		driver.findElement(By.name("search_query")).sendKeys("T-shirt");
//		driver.findElement(By.name("submit_search")).click();
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
//		driver.findElement(By.className("home")).click();
//		int anchor = driver.findElements(By.tagName("a")).size();
//		System.out.println(anchor);
		
		
		driver.quit();
		
	}

}
