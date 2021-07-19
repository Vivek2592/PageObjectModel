package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class Form1Page extends TestBase {
	
	WebElement Form = driver.findElement(By.xpath(""));
	WebElement txtSNumber = driver.findElement(By.xpath(""));
	WebElement txtName = driver.findElement(By.xpath(""));
	WebElement txtSex = driver.findElement(By.xpath(""));
	WebElement txtAge = driver.findElement(By.xpath(""));
	WebElement btnAdd = driver.findElement(By.xpath(""));
	
	
	public void NavigateToForm() {
		
	}
	
	public void FillForm(String SNumber, String Name, String Sex, String Age) {
		txtSNumber.sendKeys(SNumber);
		txtName.sendKeys(Name);
		txtSex.sendKeys(Sex);
		txtAge.sendKeys(Age);
		btnAdd.click();
	}

}
