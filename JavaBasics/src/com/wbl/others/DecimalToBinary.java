package com.wbl.others;

import java.util.Stack;

public class DecimalToBinary {

	
	public static void decimalToBinary(int decimal){
		int rem =0;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(decimal>0){		
		rem=decimal%2;
		decimal = decimal/2;
		stack.push(rem);
		}
		
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
		
	}
	
	public static void main(String[] args) {
		decimalToBinary(5);
	}

}
