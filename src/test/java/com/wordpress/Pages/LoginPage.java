package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	

	@FindBy(xpath="//*[@id='txtUsername']") 
	WebElement username;
	
	@FindBy(how=How.XPATH, using="//*[@id='txtPassword']") 
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id='btnLogin']") 
	WebElement submit;
	
	
	public void login_orange(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit.click();
		
	}
	
}

