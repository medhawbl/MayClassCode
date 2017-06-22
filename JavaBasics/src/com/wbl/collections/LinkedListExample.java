package com.wbl.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public void linkedListBasics(){
		LinkedList<Integer> studentIds = new LinkedList<Integer>();//create a collection object
		//ArrayList<Integer> studentIds1 = new ArrayList<Integer>();
		//add elements to collection object
		studentIds.add(10);
		studentIds.add(40);
		studentIds.add(30);
		studentIds.add(5);
		studentIds.add(50);
		//inserting elements at end, begining or in between the list is faster when we use LinkedList
		studentIds.addFirst(1000);
		studentIds.addLast(5000);
		studentIds.add(2,7886);
		
		System.out.println("returns head element:"+ studentIds.peek());
		for(Integer id : studentIds){
			System.out.println(id);
		}
		
		System.out.println("returns head element and removes it:"+ studentIds.poll());
		for(Integer id : studentIds){
			System.out.println(id);
		}
		
		
		/*System.out.println("is present: "+studentIds.contains(40));
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
		Iterator<Integer> itr = studentIds.iterator();
		while(itr.hasNext()){
			int id = itr.next();
			System.out.println(id);
			if(id>30){
				itr.remove();
			}
		}
		System.out.println("after iterator remove: ");
		for(Integer id : studentIds){
			System.out.println(id);
		}
		
		*/
	}
	
	public static void main(String args[]){
		LinkedListExample le = new LinkedListExample();
		le.linkedListBasics();
	}

}
