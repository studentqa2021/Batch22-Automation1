package com.collections;

import java.util.HashSet;
import java.util.Set;

public class PracticeHashSet {
	
	Set<Integer> mySet = new HashSet<>(); //remove duplicate 2, 4, 4, 5, 8, 9, 9
	
	public Set<Integer> getArrayValue() {
	
		//To add value in Set, we use add() method
		mySet.add(2);
		mySet.add(4);
		mySet.add(4);
		mySet.add(5);
		mySet.add(8);
		mySet.add(9);
		mySet.add(9);
		
		System.out.println(mySet); //{2, 4, 5, 8, 9}
		
		return mySet;
		
	}
	
	public static void main(String[] args) {
		PracticeHashSet obj = new PracticeHashSet();
		obj.getArrayValue();
		
	}

}
