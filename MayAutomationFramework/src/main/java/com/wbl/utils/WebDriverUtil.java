package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class WebDriverUtil {

	//Factory Design pattern
	public static WebDriver getDriver(String browsername){
		WebDriver driver =null;
		try{
		
			switch(browsername){
			
			case "chrome":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "ie":
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
				
			case "htmlunit":
				driver = new HtmlUnitDriver();
				break;
				
			case "phantom":
				System.setProperty("phantomjs.binary.path", System.getProperty("user.dir") + "/resources/drivers/phantomjs.exe");
				driver = new PhantomJSDriver();
				break;

			default:
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
		}catch(Exception e){
			System.out.println("There is an exception when creting WebDriver object");
			System.out.println(e.getStackTrace());
		}
		return driver;		
	}
}
