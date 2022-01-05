package com.map.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompareHashMap {

	public static void main(String[] args) {

		Map<Integer,String>  map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		Map<Integer,String>  map2 = new HashMap<>();
		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		
		Map<Integer,String>  map3 = new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//Question 1:  compare hashmap based on key-value pair - using equals method
		
		System.out.println(map1.equals(map2));  // it will return true
		System.out.println(map1.equals(map3));  // it will return false
		
		
		// Question 2 : compare hashmap based on key - using keySet();
		
		System.out.println("compare based on map1 and map2  keys  :->  "+ map1.keySet().equals(map2.keySet())); // returns true
		
		// below code  also return true as duplicate keys are ignore because keyset stores the value in set
		
		System.out.println("compare based on map1 and map2  keys  :->  "+ map1.keySet().equals(map3.keySet())); 
		
		 
		
		
		// Question 3: Find out the addition key from two hashmap  - Using hashset
		
		Map<Integer,String>  map4 = new HashMap<>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		Set<Integer>  set = new HashSet<>(map1.keySet());
		set.addAll(map4.keySet());  // combined both the map
		
		set.removeAll(map1.keySet());
		System.out.println(set);
		
		
		// Questions 4 : compare the map by values
		
		Map<Integer,String>  map5 = new HashMap<>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		
		Map<Integer,String>  map6 = new HashMap<>();
		map6.put(3, "C");
		map6.put(2, "B");
		map6.put(1, "A");
		
		Map<Integer,String>  map7 = new HashMap<>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		
	// Using Arraylist -> in this duplicate will also be considered for comparing
		System.out.println("-----;--------  comparing the values Using Arraylist -------------------");
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
	// Using Hashset  --> 	in this duplicate will also be ignored for comparing
		
		System.out.println("-----;--------  comparing the values Using Hashset -------------------");
		
	    System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
		
		
		
		
		
	}

}
