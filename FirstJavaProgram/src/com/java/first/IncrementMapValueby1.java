package com.java.first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IncrementMapValueby1 {

	public static void main(String[] args) {
		incrementmapValue();

	}
	
	private static void incrementmapValue() {
		
		Map<Character,Integer> map = new HashMap<>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		
		Iterator<Entry<Character,Integer>>  it= map.entrySet().iterator();
		
		while(it.hasNext()) {
			   Entry<Character, Integer>  entry = it.next();
			   map.put(entry.getKey(), entry.getValue()+1);
		}
		
		System.out.println(map);
		
		
		
		
		
		
	}

}
