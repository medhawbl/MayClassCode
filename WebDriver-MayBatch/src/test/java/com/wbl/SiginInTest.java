package com.wbl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SiginInTest {

	WebDriver driver;
	@Test(enabled=true)
	public void fileUploadWithAutoIt() throws AWTException{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
