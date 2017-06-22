package com.wbl.test;

import java.io.IOException;

import com.wbl.oops.Animal;
import com.wbl.oops.Dog;

public class TestAnimal extends Animal{

	public static void main(String[] args) throws Exception {
		
		//parent class reference and parent class object
		Animal animal = new Animal();
		animal.setName("Punto");
		animal.makeNoise();
		
		//parent class reference and child class object
		animal = new Dog();
		animal.makeNoise();
		
		Dog dog = new Dog();
		dog.catchThieves();
		dog.catchThieves("Robert");
		dog.catchThieves(6);
		
		animal = new Animal();
		animal.setName("Prince");
		animal.makeNoise();
		
		
		
		
		
		/*
		Animal dog = new Animal();
		dog.name = "Pinto";
		dog.color = "White";
		dog.breed = "pug";
		
		dog.displayDetails();
		dog.eat();
		dog.makeNoise();
		
		Animal cat = new Animal();
		cat.name = "Kitten";
		cat.color = "Black";
		cat.breed = "abc";
		
		cat.displayDetails();
		cat.eat();
		cat.makeNoise();
		
		Animal dog1 = new Animal();
		dog1.setName("rexy");
		dog1.setColor("Black");
		dog1.breed="xyz";
		
		dog1.displayDetails();*/
	}

}
