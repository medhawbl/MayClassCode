package com.wbl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;


public class HomePageTest extends BaseTest{

	HomePage hm;
	
	@Test
	public void searchTest(){
		hm = new HomePage(driver);
		String actual=hm.search("Laptop");
		Assert.assertEquals("Laptop - Walmart.com", actual);
	}
}
