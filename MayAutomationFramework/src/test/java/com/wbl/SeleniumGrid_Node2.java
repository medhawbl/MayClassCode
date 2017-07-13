package com.wbl;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class SeleniumGrid_Node2 {

	static Logger log = LogManager.getLogger(SeleniumGrid_Node2.class);
	
	@Test
	public void gridTest(){
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.15.2:5556/wd/hub"), dc);
			driver.get("https://www.google.com/");
			
			System.out.println("Title "+driver.getTitle());
			
			driver.findElement(By.id("lst-ib")).sendKeys("Selenium Grid");
			driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
			
			System.out.println("Serach Results page Title "+driver.getTitle());
			
			driver.close();
			
		} catch (Exception e) {
			log.error("Exception occured in grid execution!!");
			log.error(e.getMessage());
		}
		
	}
}
