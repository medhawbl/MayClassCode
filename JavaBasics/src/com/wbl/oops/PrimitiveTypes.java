package com.wbl.oops;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		byte b = 127;// -128 to 127
		byte b1 = 0b00001000;
		System.out.println(b1);
		
		short s = 125;
		int i = 455678767;
		long l = 567893245679l;
		float f = 57.78f;
		double d = 78679.77899;
		char c = 'h';
		boolean bool = true;	
		
		//Explicit 
	/*	s=b; //s=127
		l=i; // l= 455678767
		d=f; //d=57.78f
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);*/
		
		b=(byte) s;
		i=(int)l;
		f=(float) d;
		System.out.println(b);
		System.out.println(i);
		System.out.println(f);
		
		
		
	}

}
