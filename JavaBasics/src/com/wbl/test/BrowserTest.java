package com.wbl.test;

import com.wbl.oops.abstraction.Browser;
import com.wbl.oops.abstraction.ChromeBrowser;
import com.wbl.oops.abstraction.FirefoxBrowser;

public class BrowserTest{

	public static void main(String[] args) {
		//Browser b = new Browser(); compilation error bcz we cannot create object for abstract classes
		Browser browser = new ChromeBrowser();
		browser.browseDetails();
		browser.devTools();		

		browser = new FirefoxBrowser();
		browser.browseDetails();
		browser.devTools();
	}

}
