package com.wordpress.Testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BrowserFactory;

public class WindowHandlesDemo extends BrowserFactory{
	WebDriver driver;
	
	@Test
	public void windowHandles() {
		
	driver = startBrowser("chrome","https://www.hyrtutorials.com/p/window-handles-practice.html");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		WebElement winbtn = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", winbtn);
		
		for(String winHandle: driver.getWindowHandles())
		{
			if(!parentHandle.contentEquals(winHandle))
			{
				driver.switchTo().window(winHandle);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sourabh");
				//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Sharma");
			
				//input[@id='lastName']
				driver.close();
			}
			
			driver.switchTo().window(parentHandle);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("parent window");
			
		}
		
	}
	
	
	
}
