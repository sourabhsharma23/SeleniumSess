package com.wordpress.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

import utility.BrowserFactory;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() {
		
	WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login_orange("Admin", "admin123");
	
	}
	
}
