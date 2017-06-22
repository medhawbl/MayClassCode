package com.wbl.others;

public class CrossBrowserTest implements Runnable{
	
	String browserName;
	
	@Override
	public void run(){
		if(browserName.equals("Chrome")){
		
			for(int i=0;i<20;i++){
				System.out.println("hello to chrome");
				System.out.println(i);
			}		
		}else if(browserName.equals("Firefox")){
			
			for(int i=0;i<20;i++){
				System.out.println("hello to firefox");
				System.out.println(i);
			}		
		}else if(browserName.equals("safari")){
			
			for(int i=0;i<20;i++){
				System.out.println("hello to safari");
				System.out.println(i);
			}		
		}
	}

}
