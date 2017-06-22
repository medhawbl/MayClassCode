package com.wbl.oops;

public class Student {

	public int id;
	public String name;
	
	public Student(){
		System.out.println("Hello, from default constructor!! ");
	}
	
	public Student(int id1, String name1){
		System.out.println("Hello, from paramterized constructor!! ");
		id = id1;
		name  = name1;
	}
	
		
	public void displayDetails(){
		System.out.println("id : " + id);
		System.out.println("name : " + name);
	}
	
	public int getId(){
		return this.id;
	}
	
}
