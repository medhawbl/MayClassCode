package com.wbl.oops.abstraction;

public abstract class Browser extends XpathCheck{

	protected String cookie;
	
	public Browser(){
		System.out.println("parent class constructor");
	}
	//concrete methods
	public void browseDetails(){
		System.out.println("Enter any URL and getdetails of given website");
	}
	
	// abstract methods
	public abstract void devTools();
	
	public abstract boolean clearHistory();
	
	public abstract void setCookies(String cookie);
	
	public abstract  String getCookies();
}
