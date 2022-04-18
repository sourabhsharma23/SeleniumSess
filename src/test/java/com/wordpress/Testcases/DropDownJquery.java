package com.wordpress.Testcases;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownJquery {
	
	@Test
	public void HandleDropDown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@id,'btndropdown')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> listEle = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label//input[@type='checkbox']"));
		
		System.out.println(listEle.size());
		
		for(WebElement wele :listEle) {
			if(wele.getText().contains("HTML"))
			{
				wele.click();
				
				break;
			}
		}
		
	}
	
}
