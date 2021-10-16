package com.java.first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapBykey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Zebra", 5);
		map.put("Cadbury", 3);
		map.put("Barkha", 12);
		map.put("Tetsing", 22);
		map.put("Abaratu", 1);
		
		sortByMap(map);

	}

	private static void sortByMap(Map<String, Integer> map) {
		Map<String,Integer> treemap= new TreeMap<String, Integer>();
		treemap.putAll(map);
		
		
		Set<Entry<String,Integer>> entry =treemap.entrySet();
		
		for (Entry<String, Integer> entry2 : entry) {
			 System.out.println("Key is  "+ entry2.getKey() + "  Value is " +entry2.getValue());
		}
		
	}
	
	
}
