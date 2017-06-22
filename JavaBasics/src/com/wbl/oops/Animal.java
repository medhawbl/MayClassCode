package com.wbl.oops;

import java.io.IOException;

public class Animal{
	//Properties
	public String name;
	public String color;
	public String breed;
	public byte nooflegs=4;
	
	//Methods
	public void eat(){
		System.out.println(name + " eats food");
	}
	
	public void makeNoise() throws IOException{
		System.out.println(name + " makes Noise");
	}

	public void displayDetails(){
		System.out.println("Name is : " + name);
		System.out.println("Color is : " + color);
		System.out.println("Breed is : " + breed);
	}
	
	public void setName(String inputName){
		name = inputName;
	}
	
	public void setColor(String inputColor){
		color = inputColor;
	}
	
}
