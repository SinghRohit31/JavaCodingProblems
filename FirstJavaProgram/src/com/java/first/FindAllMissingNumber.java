package com.java.first;

import java.util.Arrays;

public class FindAllMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,3,4,6,8,9};
		
		Arrays.sort(arr);
		
		
		int arrayIndex=0;
		
		
		for (int i = 0; i < arr[arr.length-1]; i++) {
			if(i==arr[arrayIndex]) {
				arrayIndex++;
			}
			else System.out.println(i);
			
		}
		
		
		
		
		
		
	}

}
