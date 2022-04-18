package com.wordpress.Testcases;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboadEvents {

	@Test
	public void keyBoadEventTrying() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		
		for(String winhandle : driver.getWindowHandles()) {
			
			if(!parent.contentEquals(winhandle)) {
				
				driver.switchTo().window(winhandle);
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sourabh");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
				Actions act = new Actions(driver);
				act.sendKeys(Keys.TAB);
				
				
			}
			
		}
		driver.quit();
	}
	
	
}
