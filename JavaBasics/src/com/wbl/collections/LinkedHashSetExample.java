package com.wbl.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public void setBasics(){
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("java");
		set.add("collections");
		set.add("collections");
		set.add(null);
		set.add(null);
		
		for(String setValue: set){
			System.out.println(setValue);
		}
		
	}
	
	public static void main(String args[]){
		LinkedHashSetExample he = new LinkedHashSetExample();
		he.setBasics();
	}

}
