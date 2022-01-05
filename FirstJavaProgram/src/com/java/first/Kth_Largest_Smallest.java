package com.java.first;

public class Kth_Largest_Smallest {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,9,6,33,19};
		int size =  arr.length;
		Nth_Largest_Smallest(arr, 3, size);
	}
	
	public static void Nth_Largest_Smallest(int[] arr ,int k, int size) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
		System.out.println("K the smallest Number is  :  " + arr[k-1]);
		System.out.println("K the Largest number is  :  " + arr[size-k]);
		
	}

}
