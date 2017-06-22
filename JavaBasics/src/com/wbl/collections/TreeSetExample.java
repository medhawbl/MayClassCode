package com.wbl.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.wbl.oops.Employee;

public class TreeSetExample {
	
	public void setBasics(){
		Set<String> set = new TreeSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("java");
		set.add("collections");
		set.add("collections");
	    //set.add(null);
		//set.add(null);
		
		for(String setValue: set){
			System.out.println(setValue);
		}
		
	}
	
	public void setCustomObjectsSortEg(){
		
		Set<Employee> employees = new TreeSet<Employee>();
		
		employees.add(new Employee(3,"Alan"));
		employees.add(new Employee(2,"Joe"));
		employees.add(new Employee(10,"John"));
		employees.add(new Employee(1,"Smith"));
		
		
		
		for(Employee setValue: employees){
			System.out.println("id: "+setValue.getId());
		}
	}
	
	public static void main(String args[]){
		TreeSetExample he = new TreeSetExample();
		he.setCustomObjectsSortEg();
	}

}
