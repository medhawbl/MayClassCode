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


public class SauceLabsTest {

	 public static final String USERNAME = "wbltraining";
	  public static final String ACCESS_KEY = "12fe9d7d-a76e-4139-b70a-52be66ed9db4";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows XP");
	    caps.setCapability("version", "43.0");
	 
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 
	    driver.get("https://www.google.com");
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();
	  }
}
