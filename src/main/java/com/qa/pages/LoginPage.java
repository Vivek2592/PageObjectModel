package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@CacheLookup
	WebElement txtUsername = driver.findElement(By.id("Username"));
	WebElement txtPassword = driver.findElement(By.id("Password"));
	WebElement btnLogin = driver.findElement(By.id("btnLogin"));
	
	
	public String validatetitle() {
		return driver.getTitle();
	}
	
	public HomePage validateLogin(String Username , String Password) {
		
		txtUsername.sendKeys(Username);
		txtPassword.sendKeys(Password);
		btnLogin.click();
		return new HomePage();
		
	}
	

}
