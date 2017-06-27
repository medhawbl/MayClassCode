package com.wbl;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Alerts_BrowserNotifications {

	WebDriver driver;
	@Test(enabled=true)
	public void fileUploadWithAutoIt() throws AWTException{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/resources/drivers/geckodriver.exe");
	//	ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//driver = new ChromeDriver(options);
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("dom.disable_beforeunload", true);
		
		driver= new FirefoxDriver(profile);
		
		
		driver.get("https://www.myntra.com/");
		
	}
}
