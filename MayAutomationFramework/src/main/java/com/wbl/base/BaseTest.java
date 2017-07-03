package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.wbl.utils.ConfigUtils;
import com.wbl.utils.Constants;
import com.wbl.utils.WebDriverUtil;

public class BaseTest {

	protected WebDriver driver;
	protected static String url;
	protected static String browser;
	
	@BeforeSuite//(alwaysRun=true)
	public void beforeSuite(){
		ConfigUtils configUtils = new ConfigUtils(Constants.RESOURCES_PATH+"config.properties");
		url=configUtils.getProperty("stageUrl");
		browser=configUtils.getProperty("browser");
	}
	
	@BeforeMethod//(alwaysRun=true)
	public void beforeClass(){
		driver = WebDriverUtil.getDriver(browser);
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@AfterMethod//(alwaysRun=true)
	public void afterClass(){
		driver.quit();
	}
}
