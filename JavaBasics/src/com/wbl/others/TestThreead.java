package com.wbl.others;

public class TestThreead {

	public static void main(String[] args) throws InterruptedException {
		CrossBrowserTest c1 = new CrossBrowserTest();
		c1.browserName="Chrome";
		
		Thread thread1 = new Thread(c1);
		thread1.start();	
		thread1.sleep(500);
		
		CrossBrowserTest c2 = new CrossBrowserTest();
		c2.browserName="Firefox";
		Thread thread2 = new Thread(c2);
		thread2.start();		
		

	}

}
