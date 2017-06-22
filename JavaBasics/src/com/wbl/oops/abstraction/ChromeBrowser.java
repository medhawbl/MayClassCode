package com.wbl.oops.abstraction;

public class ChromeBrowser extends Browser{

	@Override
	public void devTools() {
		System.out.println("chrome devtools");
	}

	@Override
	public boolean clearHistory() {
		//to-do- write logic to clear history
		boolean historyCleared= true;
		System.out.println("Chrome clear history");
		if(historyCleared){
			return true;
		}
		return false;
	}

	@Override
	public void setCookies(String cookie) {
		this.cookie=cookie;
		System.out.println("chrome set cookie: "+cookie);
	}

	@Override
	public String getCookies() {
		System.out.println("chrome get cookie");
		return cookie;
	}

	@Override
	public void xpathChecker() {
		// TODO Auto-generated method stub
		
	}

}
