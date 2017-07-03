package com.wbl.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.pages.SearchResultsPage;

public class CommonPage {

	protected WebDriver driver;
	
	@FindBy(how=How.CSS,using=".header-GlobalEyebrowNav-link")
	List<WebElement> navLinks;
	
	public CommonPage(WebDriver driver){
		this.driver=driver;
	}
	

	public String getTitle(){
		return driver.getTitle();
	}
	
	
	
	public int headerNavLinks(){
		return navLinks.size();
	}
	
	public void headerModalDropDowns(){
		List<WebElement> elements = driver.findElements(By.cssSelector("[id*='header-GlobalEyebrowNav-button']"));
		Actions action = new Actions(driver);
		for(WebElement elm:elements){
			action.moveToElement(elm).perform();
			List<WebElement> elms = driver.findElements(By.cssSelector(".header-GlobalEyebrowNav-flyout-listItem.font-normal"));
			for(WebElement elmt:elms){
				System.out.println(elmt.getText());
			}
		}
	}
	
	public int footerLinks(){
		return driver.findElements(By.cssSelector(".heading-f.footer-GlobalFooterItems-heading")).size();
	}
}
