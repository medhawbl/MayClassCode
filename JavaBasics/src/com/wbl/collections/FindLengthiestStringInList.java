package com.wbl.collections;

import java.util.ArrayList;
import java.util.List;

public class FindLengthiestStringInList {

	// {"hi", "hello","java"} - hello

	public String findLengthiestStringInList(List<String> inputList) {
		String result ="";
		
		if(null!=inputList){
		result = inputList.get(0);

		for (int i = 1; i < inputList.size(); i++) {

			int length = inputList.get(i).length();
			if (length > result.length()) {
				result = inputList.get(i);
			}
		}
		}else{
			System.out.println("input is null- please provide valid input");
		}
		return result;
	}

	public static void main(String args[]) {
		FindLengthiestStringInList fl = new FindLengthiestStringInList();
		List<String> input = new ArrayList<String>();
		input.add("hi");
		input.add("hello");
		input.add("java");

		System.out.println("output: " + fl.findLengthiestStringInList(input));
	}

}
