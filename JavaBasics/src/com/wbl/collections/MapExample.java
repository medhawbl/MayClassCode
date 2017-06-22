package com.wbl.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.wbl.oops.Employee;

public class MapExample {
	
	public void mapExample(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(133, "John");
		map.put(2, "Esta");
		map.put(3, "Erica");
		map.put(4, "victor");		
		map.put(5, "JohnSmith");		
		map.put(5, "Joe");
		map.put(null, "alan");
		
		System.out.println("size:"+map.size());
		
		Set<Integer> keys = map.keySet();
		
		//method 1 to iterate a map
		for(Integer key: keys){
			System.out.println("key:"+key+":value:"+ map.get(key));
		}
		
		//method 2 to iterate a map
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
	}
	
	public Map<Employee,String> mapCustomObjectAsKeyExample(){
		
		Map<Employee,String> map = new HashMap<Employee,String>();
		
		Employee e1 = new Employee(1,"Alan");	
		
		Employee e2 = new Employee(2,"Adam");	
		
		map.put(e1,"JavaDeveloper");
		map.put(e2,"RubyDeveloper");
		
	
		return map;
		
	}
	
	public Map<String,String> mapExample2(){
		 Map<String,String> me = new  HashMap<String,String>();
		 me.put("Alan", "Java");
		 me.put("Swetha", "Android");
		 return me;
	}
	
	public void linkedHashMapExample(){
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(133, "John");
		map.put(2, "Esta");
		map.put(3, "Erica");
		map.put(4, "victor");		
		map.put(5, "JohnSmith");		
		map.put(5, "Joe");
		map.put(null, "alan");
		
		System.out.println("size:"+map.size());
		
		Set<Integer> keys = map.keySet();
		
		//method 1 to iterate a map
		for(Integer key: keys){
			System.out.println("key:"+key+":value:"+ map.get(key));
		}
		/*
		//method 2 to iterate a map
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}*/
	}
	
	public void treeMapExample(){
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(133, "John");
		map.put(2, "Esta");
		map.put(3, "Erica");
		map.put(4, "victor");		
		map.put(5, "JohnSmith");		
		map.put(5, "Joe");
		
		System.out.println("size:"+map.size());
		
		Set<Integer> keys = map.keySet();
		
		//method 1 to iterate a map
		for(Integer key: keys){
			System.out.println("key:"+key+":value:"+ map.get(key));
		}
		/*
		//method 2 to iterate a map
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}*/
	}
	
	
	

}
