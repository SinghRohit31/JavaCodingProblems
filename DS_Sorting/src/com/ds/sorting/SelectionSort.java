package com.ds.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] abc1= {4,-6,7,1,0,8,3,9};
		selectionSort(abc1);
		System.out.println(Arrays.toString(abc1));
	}
	
	// steps : find max value or min value index at swap it at its correct Position
	// Below we are finding the max value index and swapping it with its correct position
	
	static void selectionSort(int[] abc) {
		for (int i = 0; i < abc.length; i++) {
				
			int last=abc.length-1-i;
			int getMaxIndex= getMaxValueindex(abc, 0 ,last);
			swap(abc,getMaxIndex,last);
		}
		
	}

	private static void swap(int[] abc,int first, int second) {
		int temp=abc[first];
		abc[first]=abc[second];
		abc[second]=temp;
		
	}


	static int getMaxValueindex(int[] arr, int start ,int last){
		int max=start;
		
		for (int i = start; i <=last; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
		
	}

}
