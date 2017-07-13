package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(css=".btn.btn-primary")
	WebElement submitButton;
	
	
	public String login(String name, String pwd){
		username.sendKeys(name);
		password.sendKeys(pwd);
		submitButton.click();
		return driver.getTitle();
	}
}
