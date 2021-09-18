package com.java.first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String, String>  map= new HashMap<String, String>();
		map.put("MH", "Mumbai");
		map.put("MP", "Bhopal");
		map.put("UP", "Lucknow");
	
	// 	Using Keyset() and Iterator
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String Value= map.get(key);
			System.out.println("City  is  : " + key + "  Capital is : "+ Value);
		}
		
	// Using entrySet and Iterator
		
		Iterator<Entry<String, String>>entry = map.entrySet().iterator();
		
		
		while(entry.hasNext()) {
			Entry<String,String >entryset = entry.next();
			String key = entryset.getKey();
			String Value = entryset.getValue();
			System.out.println("Key is :" + key + "  Value is : " + Value);
			
		}
		
		
		
	}

}
