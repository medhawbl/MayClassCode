package com.wbl;

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
		driver.get("http://www.monsterindia.com/");	
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Thread.sleep(2000);
		
		wait.until(function);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fileUpload.btn>span:nth-of-type(1)")));
		element.click();
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wordresume"))).click();
		
		Thread.sleep(2000);
		//to embed autoit exe file in java code abd run the exe file
		Runtime.getRuntime().exec("C:\\FileUploadAutoIT.exe");
		Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		//Thread.sleep(2000);
		
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
