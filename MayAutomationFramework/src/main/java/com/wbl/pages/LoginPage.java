package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.CommonPage;

public class LoginPage extends CommonPage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String login(String username, String password){
		driver.findElement(By.id("")).sendKeys(username);
		driver.findElement(By.id("")).sendKeys(password);
		driver.findElement(By.id("")).click();
		return driver.getTitle();
	}
	
}
