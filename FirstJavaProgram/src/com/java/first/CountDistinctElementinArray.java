package com.java.first;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElementinArray {

	public static void main(String[] args) {
		int[] abc = {10,20,30,10,40,20};
		System.out.println(countDistinceElement(abc));
	}

	private static int countDistinceElement(int[] abc) {
			
		Set<Integer>  set= new HashSet<>();
		
		int distinctElement=0;
		int DuplicateElement=0;
	
		for (Integer element : abc) {
			
			if(set.add(element)==false) {
				//System.out.println("Duplicate element is " + element);
				DuplicateElement++;
			}else {
				System.out.println("distinctElement element is " + element);
				distinctElement++;
			}
			
		}
		
		return distinctElement;
		
		
		
		
	}
	
}
