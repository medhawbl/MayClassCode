package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}

	public SearchPage clickSearchButton(){
		WebElement element = driver.findElement(By.id("site-search-button"));
		element.click();		
		//driver.findElement(By.id("site-search-button")).click();
		return new SearchPage(driver);
	}
}
