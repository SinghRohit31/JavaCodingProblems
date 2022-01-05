package com.java.first;

public class RangeMaxandMin {

	public static void main(String[] args) {
		int[] arr = {-2,1,2,3,5,8,12,98};
		Range_Max_Min(arr, arr.length);
	}
	
	public static void Range_Max_Min(int[] arr, int size) {
		
		int largest=arr[0];
		int smallest= arr[0];
		
		for (int i = 1; i < size; i++) {
			if (largest<arr[i]) {
				largest=arr[i];
			}
			
			if (smallest>arr[i]) {
				smallest=arr[i];
			}
			
		}
		
		System.out.println(" largest is " +largest);
		System.out.println(" smallest is " +smallest);
		
		System.out.println("diffrence between Max and Min is : " + (largest-smallest));
		
	}

}
