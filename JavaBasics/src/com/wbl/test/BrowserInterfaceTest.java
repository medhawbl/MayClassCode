package com.wbl.test;

import com.wbl.oops.abstraction.ChromeBrowser1;
import com.wbl.oops.abstraction.FirefoxBrowser1;
import com.wbl.oops.abstraction.IBrowser;

public class BrowserInterfaceTest {

	public static void main(String args[]){
	 IBrowser browser = new ChromeBrowser1();
	 browser.devTools();
	 browser.browseDetails("chrome");
	 IBrowser.getBrowserDetails();
	 
	 browser = new FirefoxBrowser1();
	 browser.devTools();
	 browser.browseDetails("firefox");
	 IBrowser.getBrowserDetails();
	}
}
