package com.wbl;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FileUpload{

	WebDriver driver;
	@Test(enabled=true)
	public void fileUploadWithAutoIt(){
		try{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://my.monsterindia.com");
	
		WebDriverWait wait = new WebDriverWait(driver,30);
	
		Thread.sleep(2000);
	
		wait.until(function);
	
		//	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fileUpload.btn>span:nth-of-type(1)")));
		//element.click();
	

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wordresume"))).click();
	
		StringSelection selectPath = new StringSelection("C:\\HelloWorld1.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectPath,null);
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		/*	WebDriverWait wait = new WebDriverWait(driver,30);
		
		Thread.sleep(2000);
		
		wait.until(function);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fileUpload.btn>span:nth-of-type(1)")));
		element.click();
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wordresume"))).click();
		
		Thread.sleep(2000);
		//to embed autoit exe file in java code abd run the exe file
		Runtime.getRuntime().exec("C:\\FileUploadAutoIT.exe");*/
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	
	
	Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){

		public Boolean apply(WebDriver arg0) {
			String currWin = driver.getWindowHandle();
			Set<String> allWins=driver.getWindowHandles();
			
			for(String win : allWins){
				if(!currWin.equals(win)){
					driver.switchTo().window(win).close();
					break;
				}
			}
			
			driver.switchTo().window(currWin);
			return true;
		}

		
	};
	
}
