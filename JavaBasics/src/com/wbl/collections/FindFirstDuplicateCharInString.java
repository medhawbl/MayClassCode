package com.wbl.collections;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateCharInString {
	
	//hello - l, java - a, collection-l
	
	public char findFirstDuplicateChar(String input){
		char output=' ';
		Set<Character> set = new HashSet<Character>();
		//char[] ch = input.toCharArray();
		if(null!=input && !input.isEmpty()){
			for(int i=0; i<input.length();i++){
				char ch = input.charAt(i);
				//add method in set returns false if its duplicate
				if(!set.add(ch)){
					return ch;
				}else{
				    set.add(ch);
				}
			}
			
		}else{
			System.out.println("input is null or blank- please provide valid input");
		}
		return output;
		
	}
	
	public static void main(String[] args){
		FindFirstDuplicateCharInString fd = new FindFirstDuplicateCharInString();
		System.out.println("output: "+fd.findFirstDuplicateChar("hello"));
		System.out.println("output: "+fd.findFirstDuplicateChar("java"));
		System.out.println("output: "+fd.findFirstDuplicateChar("collection"));
		System.out.println("output: "+fd.findFirstDuplicateChar(""));
		System.out.println("output: "+fd.findFirstDuplicateChar(null));
		System.out.println("output: "+fd.findFirstDuplicateChar("464634"));
		System.out.println("output: "+fd.findFirstDuplicateChar("he47llo"));
	}

}
