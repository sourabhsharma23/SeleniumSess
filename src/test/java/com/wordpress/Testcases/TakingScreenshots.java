package com.wordpress.Testcases;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BrowserFactory;

public class TakingScreenshots extends BrowserFactory{

	WebDriver driver;
	
	@Test
	public void screenshot() throws IOException {
		
		driver = startBrowser("chrome","https://demo.nopcommerce.com/");
		
		
		//Full page screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trgt = new File("/Users/labuser/eclipse-workspace/SeleniumSessions/Screenshots/homepage.png");
//		
//		try {
//			FileUtils.copyFile(src, trgt);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Particular section on page
		WebElement ele = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trgt = new File("/Users/labuser/eclipse-workspace/SeleniumSessions/Screenshots/feature.png");
		FileUtils.copyFile(src, trgt);
		
		
		driver.close();
	}
	
	
}
