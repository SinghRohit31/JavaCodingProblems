package com.java.first;

public class CountOccurenceInArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,3,4,3,5,3,6,3};
		
		countOccurence(arr, 3, arr.length);
	}
	
	public static void countOccurence(int[] arr, int number, int size) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==number) {
				count++;
			}
		}
		System.out.println( "Number of Occurences are of n : " + count);
	}

}
