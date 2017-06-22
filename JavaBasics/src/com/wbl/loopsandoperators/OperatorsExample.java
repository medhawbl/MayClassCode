package com.wbl.loopsandoperators;

import com.wbl.oops.Animal;

public class OperatorsExample extends Object {	
	

	public static void main(String[] args) {
		
		int a = 4;
		int b = 10;
		
	/*	//Arithimatic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		

		//unary operators
		int i=5;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
		boolean bool = true;
		if(!bool){
			System.out.println("Hello");
		}
		else{
			System.out.println("World");
		}
		
		//Relational Operators
		if(a>b){
			System.out.println("A is Greater");
		}else if(a<b){
			System.out.println("B is Greater");
		}else if(a==b){
			System.out.println("Both are equal");
		}*/
		
		//Conditional Operators
		if((a%2)==0  || (a%5)==0){
			System.out.println("a is divisible by both 2 and 5");
		}else if(a%2==0){
			System.out.println("A is divisible by 2");
		}else if(a%5==0){
			System.out.println("A is divisible by 5");
		}else{
			System.out.println("A is no divisible by 2 or 5");
		}
		
		//Ternary Operator
	/*	if(a<b){
			System.out.println(a);
		}else{
			System.out.println(b);
		}*/
		
		int result = a<b ? a :b;
		System.out.println(result);
		
		Animal ani = new Animal();
		System.out.println(ani.hashCode());
		
		if(ani instanceof Object){
			System.out.println("Yes");
		}
		//8 - 00001000
		int i = 0b00001000;
		int j = ~i;
		System.out.println(j);
		
	}

}
