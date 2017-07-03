package com.wbl;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchResultsPage;
import com.wbl.utils.ExcelHelper;


public class HomePageTest extends BaseTest{

	HomePage hm;
	
	@DataProvider(name="searchData")
	public Object[][] testData(){
		return ExcelHelper.getExcelData("HomePage-Data.xlsx", "Sheet1");
	}
	
	@Test(dataProvider="searchData")//(groups={"smoke"})
	public void searchTest(String searchKeyWord, String expected){	
		hm = new HomePage(driver);
		SearchResultsPage sp= hm.search(searchKeyWord);
		Assert.assertEquals(expected, sp.getTitle());
	}
	
	@Test(enabled=false)//(groups={"smoke"})
	public void headerNavLinksTest(){
		hm = new HomePage(driver);
		Assert.assertEquals(6,hm.headerNavLinks());
	}
	
	@Test(enabled=false)//(groups={"regression"})
	public void sliderImagesTest(){
		hm = new HomePage(driver);
		Assert.assertEquals(5, hm.sliderImages());;
	}
	
}
