package com.wbl.collections;

import java.util.HashSet;
import java.util.Set;

import com.wbl.oops.Employee;

public class HashSetExample {
	
	public void setBasics(){
		Set<String> set = new HashSet<String>();
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
	
	public void customObjectsInSet(){
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(1,"Alan"));
		employees.add(new Employee(2,"Joe"));
		employees.add(new Employee(1,"Alan"));
		
		
		
		for(Employee setValue: employees){
			System.out.println("id: "+setValue.getId());
		}
		
	}
	
	public static void main(String args[]){
		HashSetExample he = new HashSetExample();
		he.customObjectsInSet();
	}

}
