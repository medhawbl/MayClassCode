package com.wbl.oops.abstraction;

public interface IBrowser {

	public static final String cookie="COOKIE";
	
	static void getBrowserDetails(){
		System.out.println("interface static method- which is new from Java8");
	}
	
	default void browseDetails(String name){
		System.out.println("interface deafult method- which is new from Java8 : "+name);
	}
	
	// abstract methods
	public void devTools();
	
	public boolean clearHistory();
	
	public void setCookies(String cookie);
	
	public String getCookies();
}
