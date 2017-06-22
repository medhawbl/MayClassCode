package com.wbl.oops.abstraction;

public class FirefoxBrowser extends Browser {

	public  void devTools(){
		System.out.println("Firefox devtools");
	}

	public  boolean clearHistory(){
		System.out.println("Firefox clear history");
		return true;
	}

	public  void setCookies(String cookie){
		System.out.println("Firefox set cookies");
		this.cookie= cookie;
	}

	public  String getCookies(){
		System.out.println("Firefox getCookies");
		return cookie;
	}

	@Override
	public void xpathChecker() {
		// TODO Auto-generated method stub
		
	}

}
