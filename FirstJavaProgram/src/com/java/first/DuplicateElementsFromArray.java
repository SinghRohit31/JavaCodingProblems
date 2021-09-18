package com.java.first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		int[] a = { 4, 33, 44, 12, 23, 4, 5, 12 };

		// Using loops
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					System.out.println("Number is Duplicate : " + a[i]);
				}
			}
		}
		System.out.println("******************Using HashMap**************************************");
		// using Hashmap
		// int count=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer ab : a) {
			Integer count = map.get(ab);
			if (count == null) {
				map.put(ab, 1);
			} else {
				map.put(ab, ++count);
			}
		}

		Set<Entry<Integer, Integer>> entry = map.entrySet();
		for (Entry<Integer, Integer> ent : entry) {
			if (ent.getValue() > 1) {
				System.out.println("Number is Duplicate : " + ent.getKey());
			}
		}
		System.out.println("************Using HashSet********************************************");

//using Hashset
		
		
		Set<Integer> set = new HashSet<>();
		for (Integer abc : a) {
			if (set.add(abc) == false) {
				System.out.println("Duplicate Element is : " + abc);
			}
		}

	}
}
