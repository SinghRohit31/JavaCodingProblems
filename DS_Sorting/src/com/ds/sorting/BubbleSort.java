package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] abc1= {4,6,7,1,8,3,9};
		
		int[] abc= {1,2,3,4,5,6};
		bubbleSort(abc);
	}
	
	static void bubbleSort(int[] abc) {
		
		int temp;
		boolean swapped;
		for (int i = 0; i < abc.length-1; i++) {
			swapped=false;
			for (int j = 1; j < abc.length-i; j++) {
				if(abc[j]<abc[j-1]) {
					temp=abc[j-1];
					abc[j-1]=abc[j];
					abc[j]=temp;
					swapped=true;
				}
			}
			
			if(swapped==false) {
				break;
			}
		}
		
		
		for (int i : abc) {
			System.out.print(i + " ");
		}
		
		
		
		
	}

}
