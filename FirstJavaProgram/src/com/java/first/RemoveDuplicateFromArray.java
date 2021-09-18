package com.java.first;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a = {4,12,33,44,12,23,4,5,12};
	
		//Using Hashset - but it wont maintain insertion order
		
		Set<Integer> set = new HashSet<>();
		for (Integer ab : a) {
			set.add(ab);
		}
		
		System.out.println(set);
		
		
		// Using LinkedHashset - will maintain insertion order
		
		Set<Integer> linkedset = new LinkedHashSet<>();
		for (Integer ab : a) {
			linkedset.add(ab);
		}
		
		System.out.println(linkedset);
		
	}

}
