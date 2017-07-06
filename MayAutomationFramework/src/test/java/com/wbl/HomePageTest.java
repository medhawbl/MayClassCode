package com.wbl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchResultsPage;
import com.wbl.utils.Constants;
import com.wbl.utils.ExcelHelper;


public class HomePageTest extends BaseTest{

	HomePage hm;
	
	/*@DataProvider(name="searchData")
	public Object[][] testData(){
		return ExcelHelper.getExcelData("HomePage-Data.xlsx", "Sheet1");
	}
	
	@Test(dataProvider="searchData")//(groups={"smoke"})
	public void searchTest(String searchKeyWord, String expected){	
		hm = new HomePage(driver);
		SearchResultsPage sp= hm.search(searchKeyWord);
		Assert.assertEquals(expected, sp.getTitle());
	}*/
	
	@Test//(groups={"smoke"})
	public void headerNavLinksTest(){
		hm = new HomePage(driver);
		Assert.assertEquals(5,hm.headerNavLinks());	
	}
	
	@Test(priority=1)//(groups={"regression"})
	public void sliderImagesTest(){
		hm = new HomePage(driver);
		Assert.assertEquals(5, hm.sliderImages());;
	}
	
}
