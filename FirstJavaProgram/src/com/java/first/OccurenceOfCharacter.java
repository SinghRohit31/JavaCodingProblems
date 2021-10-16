package com.java.first;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		Character[] ch= {'a','b','c','a','b','c','d','e','f'};
		
		Map<Character,Integer> map=new HashMap<>();
		
		
		
		for (Character i : ch) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
