package com.wbl.oops;

import java.io.IOException;
import java.sql.SQLException;

public class Dog extends Animal {
	
	@Override
	public void makeNoise() throws IOException{
		System.out.println("Dog says bow bow");
	}

	public void catchThieves() throws IOException {
		System.out.println("Helps Police to catch thieves 1");
	}
	
	public void catchThieves(String name) throws SQLException{
		System.out.println("Helps Police to catch thieves 2 : "+ name);
	}
	
	public void catchThieves(int numberOfThieves){
		System.out.println("Helps Police to catch thieves 3 : "+numberOfThieves);
	}


}
