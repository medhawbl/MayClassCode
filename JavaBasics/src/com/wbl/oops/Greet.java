package com.wbl.oops;

public class Greet {
	
	//Globally scope
	String greet = "Hello";

	public void greeting(){
		System.out.println(greet);		
	}
	
	//Method scope
	public void test(){
		//int i;
		String str = "Roopa";
		System.out.println("Heelo World!!!");
		System.out.println(str);
		
		//block scope
		for(int i=0 ;i<5; i++){
			System.out.println(i);
		}
		//System.out.println(i);
		
	}
		
	public static void main(String[] args) {
		
		Greet g = new Greet();
		g.greeting();	
		g.test();

	}

}
