package com.wbl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchPage;

public class HomePageTest extends BaseTest{
	
	HomePage hm;
	
	@Test
	public void clickSearchButtonTest(){
		hm = new HomePage(driver);
		SearchPage sp=hm.clickSearchButton();
		//to-do assertions
		Assert.assertEquals("Custom care & coverage just for you - Kaiser Permanente", sp.searchPageTitle());
	}

}
