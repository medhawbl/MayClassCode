package com.wbl.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.base.CommonPage;
import com.wbl.utils.WebDriverWaitUtils;

public class SearchResultDetailPage extends CommonPage{

	
	public SearchResultDetailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	/*
	@FindBy(css=".prod-HeroImage-image.prod-HeroImage-imageZoomable")
	WebElement image;*/

	public boolean isSearchImagePresent(){
		
		return driver.findElement(By.cssSelector(".prod-HeroImage-container")).isDisplayed();
	}
}
