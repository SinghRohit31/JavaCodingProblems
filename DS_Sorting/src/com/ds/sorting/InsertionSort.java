package com.ds.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] abc= {4,-6,7,1,0,8,3,9};
		insertionSort(abc);
		System.out.println(Arrays.toString(abc));

	}

	private static void insertionSort(int[] abc) {
		
		for (int i = 0; i < abc.length-1; i++) {
			for(int j=i+1;j>0;j--) {
				if(abc[j]<abc[j-1]) {
					Swap(abc,j,j-1);
				}else {
					break;
				}
			}
			
		}
		
		
		
	}

	private static void Swap(int[] abc, int first, int second) {
		int temp=abc[first];
		abc[first]=abc[second];
		abc[second]=temp;
	}

}
