package com.wbl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchPage;
import com.wbl.pages.SearchResultsPage;


public class SearchPageTest extends BaseTest{
	
	HomePage hm;
	
	@Test
	public void searchTest(){
		hm = new HomePage(driver);
		SearchPage sp=hm.clickSearchButton();
		SearchResultsPage spr =	sp.search();
		Assert.assertEquals("Search results - Kaiser Permanente", spr.searchResultsTitle());
	}

}
