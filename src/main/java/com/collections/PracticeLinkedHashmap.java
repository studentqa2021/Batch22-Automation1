package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeLinkedHashmap {
	
	public static void main(String[] args) {
		
		Map <String, String> myMap = new LinkedHashMap<>(); //add Name & City
		
		myMap.put("Name", "Michael");
		myMap.put("City", "New York");
		
		System.out.println(myMap);
		
	}

}
