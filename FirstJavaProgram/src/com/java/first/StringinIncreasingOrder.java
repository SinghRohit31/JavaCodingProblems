package com.java.first;

import java.util.Iterator;

public class StringinIncreasingOrder {

	public static void main(String[] args) {
		String name = "This is new testing what";

		String[] str1 = name.split(" ");
		String temp = null;
		for (int i = 0; i < str1.length; i++) {
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].length() > str1[j].length()) {
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + " ");
		}
	}

} 
