package com.wbl.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSmokeTest{

	WebDriver driver;
	HomePage hm;
	LoginPage lp;
	String actualresp;
	
	
	@Given("^User is able to access TalentScreen HomePage and Click Login button$")
	public void user_is_able_to_access_TalentScreen_HomePage_and_Click_Login_button() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://talentscreen.io");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hm= new HomePage(driver);
		lp=hm.clickLogin();
	}


	@When("^User Click enters \"([^\"]*)\" and \"([^\"]*)\", Click on submit button$")
	public void user_Click_enters_and_Click_on_submit_button(String name, String pwd) throws Throwable {
		actualresp=lp.login(name, pwd);
		driver.navigate().back();
	}

	@Then("^User should be navigated to Login Success Home page\\.$")
	public void user_should_be_navigated_to_Login_Success_Home_page() throws Throwable {
		Assert.assertNotNull(actualresp);
	}
}
