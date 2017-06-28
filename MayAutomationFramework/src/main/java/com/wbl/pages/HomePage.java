package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.CommonPage;

public class HomePage extends CommonPage{

	//Page classes are dependent on driver object  and we need to inject driver to all page classes -dependency injection
	//Dependency injection using constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String search(String searchdata){
		driver.findElement(By.id("global-search-input")).sendKeys(searchdata);
		driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		return driver.getTitle();
	}
	
	

}
