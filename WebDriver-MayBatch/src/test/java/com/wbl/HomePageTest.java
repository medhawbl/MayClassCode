package com.wbl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchPage;

public class HomePageTest extends BaseTest{
	
	HomePage hm;
	
	@Test(enabled=false)
	public void clickSearchButtonTest(){
		hm = new HomePage(driver);
		SearchPage sp=hm.clickSearchButton();
		//to-do assertions
		Assert.assertEquals("Custom care & coverage just for you - Kaiser Permanente", sp.searchPageTitle());
	}
	
	@Test
	public void htmlUnitDriver(){
		
		System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"/resources/drivers/phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		hm = new HomePage(driver);
		driver.get("https://www.google.com/");
		System.out.println("title"+driver.getTitle());
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		System.out.println("title"+driver.getTitle());
	}

}
