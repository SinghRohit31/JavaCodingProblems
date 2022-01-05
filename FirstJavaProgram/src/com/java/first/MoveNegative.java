package com.java.first;

public class MoveNegative {

	public static void main(String[] args) {
		int[] arr= {-1,-2,-3,1,4,5,-4};
		
		moveNegative(arr);
	}
	
	static void moveNegative(int[] arr) {
		int[] arr1= new int[arr.length];
		
		int index=0;
		
		for (int i = arr.length-1; i>=0; i--) {
			if(arr[i] <0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		
		int index1= arr.length-1;
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr[i] >=0) {
				arr1[index1]=arr[i];
				index1--;
			}
			
		}
		
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			
		}

	}

}
