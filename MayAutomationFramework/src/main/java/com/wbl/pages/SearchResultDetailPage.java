package com.wbl.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.CommonPage;

public class SearchResultDetailPage extends CommonPage{

	
	public SearchResultDetailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	/*
	@FindBy(css=".prod-HeroImage-image.prod-HeroImage-imageZoomable")
	WebElement image;*/

	public boolean isSearchImagePresent(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(By.cssSelector(".prod-HeroImage-container")).isDisplayed();
	}
}
