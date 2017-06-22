package com.wbl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.wbl.oops.Employee;

public class ArrayListExample {
	
	public void listBasics(){
		List<Integer> studentIds = new ArrayList<Integer>();//create a collection object
		//ArrayList<Integer> studentIds1 = new ArrayList<Integer>();
		//add elements to collection object
		studentIds.add(10);
		studentIds.add(null);
		studentIds.add(null);
		studentIds.add(10);
		studentIds.add(10);
		studentIds.add(40);
		studentIds.add(30);
		studentIds.add(5);
		studentIds.add(50);
		Collections.replaceAll(studentIds, 30, 300);
		//size of the collection
		System.out.println("size: "+ studentIds.size());
		//get 2nd element in collection
		System.out.println("second element :"+ studentIds.get(1));
		//iterate over the collection- using basic for loop
		System.out.println("elements: ");
		for(int i=0; i<studentIds.size(); i++){
			System.out.println(studentIds.get(i));
		}
		//list to array convertion
		//Integer[] idsArray = (Integer[])studentIds.toArray();
		
		Integer valueOfRemovedElement = studentIds.remove(0);
		System.out.println("valueOfRemovedElement:"+valueOfRemovedElement);
		System.out.println("size after remove: "+ studentIds.size());
		
		//iterate over the collection- using enhanced for loop or for each
		for(Integer id : studentIds){
			System.out.println(id);
		}
		
		//Iterator
		/*Iterator<Integer> itr = studentIds.iterator();
		while(itr.hasNext()){
			int id = itr.next();
			System.out.println(id);
			if(id>30){
				itr.remove();
			}
		}*/
		System.out.println("after iterator remove: ");
		for(Integer id : studentIds){
			System.out.println(id);
		}
		
		
	}
	
	public void listCustomObjectsSortEg(){
	
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(3,"Alan"));
		employees.add(new Employee(2,"Joe"));
		employees.add(new Employee(10,"John"));
		employees.add(new Employee(1,"Smith"));	
		
		Collections.sort(employees, new EmpComparator());
		
		for(Employee setValue: employees){
			System.out.println("id: "+setValue.getId());
		}
		
		//Normal list sort
		/*List<Integer> studentIds = new ArrayList<Integer>();//create a collection object
		//ArrayList<Integer> studentIds1 = new ArrayList<Integer>();
		//add elements to collection object
		studentIds.add(10);
		//studentIds.add(null);
		//studentIds.add(null);
		studentIds.add(10);
		studentIds.add(10);
		studentIds.add(40);
		studentIds.add(30);
		studentIds.add(5);
		studentIds.add(50);
		
		Collections.sort(studentIds);
		
		for(Integer id : studentIds){
			System.out.println(id);
		}
	*/
		
	}
	
	public static void main(String args[]){
		ArrayListExample le = new ArrayListExample();
		le.listCustomObjectsSortEg();
	}

}
