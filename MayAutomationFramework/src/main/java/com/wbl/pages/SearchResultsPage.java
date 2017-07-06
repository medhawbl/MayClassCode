package com.wbl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.CommonPage;
import com.wbl.utils.WebDriverWaitUtils;

public class SearchResultsPage extends CommonPage{

	@FindBy(css=".chooser-option-current")
	WebElement sortDropDown;
	
	@FindBy(css="[class$='chooser-option']")
	List<WebElement> sortdropdownValues;
	
	@FindBy(css=".price-main-block")
	List<WebElement> prices;
	
	@FindBy(css=".search-result-product-title.listview a")
	List<WebElement> searchTitleLinks;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String selectValueFromSortDropDown(String value){
		WebDriverWaitUtils.explicitWait(driver, 20, sortDropDown);
		sortDropDown.click();	
		for(WebElement val : sortdropdownValues){
			if(val.getText().equals(value)){
				val.click();
				break;
			}
		}
	
		prices= driver.findElements(By.cssSelector(".Price-characteristic"));
		
		return prices.get(0).getText();
	}
	
	public SearchResultDetailPage clickSearchResult(int index){
		searchTitleLinks.get(index).click();
		return new SearchResultDetailPage(driver);
	}
	public float findMax(List<WebElement> elements){

		float max=0;
		for(WebElement elm : elements){
				float price= Float.parseFloat(elm.getText().replaceAll("[^0-9].", ""));
				if(price>max){
					max=price;
				}
			}
			return max;
	}
	
}
