package com.java.first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateAndcount {

	public static void main(String[] args) {
		int[] arr= {12,23,34,23,12,23,33,12,33};
		duplicatecount(arr);
	}
	
	static void duplicatecount(int[] arr) {
		
		Map<Integer,Integer>  map = new HashMap<>();
		//int count=0;
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) +1);
			}else map.put(i, 1);
			
		}
	
		
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		
		for (Entry<Integer, Integer> entry2 : entry) {
			System.out.println("Key is " +entry2.getKey()  + "  occurence is  " +entry2.getValue());
			
		}
		
		
		
	}

}
