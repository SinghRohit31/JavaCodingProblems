package com.java.first;

import java.util.Arrays;

public class ShiftZeroToLeft {

	public static void main(String[] args) {
		int[] a= {1,0,2,0,0,3,4,0};
		
		System.out.println(Arrays.toString(shiftZeroToLeft(a)));

	}

	private static int[] shiftZeroToLeft(int[] a) {
		int[] abc = new int[a.length];
		
		int count=abc.length-1;
		
		
		for(int i=abc.length-1;i>0;i--) {
			if(a[i]!=0) {
				abc[count]=a[i];
				count--;
				
			}
		}
		
		/*
		 * 
		 * 
		 * 
		 * for (Integer array : abc) { if(array!=0) { abc[count]=array; count--;
		 * 
		 * } }
		 */
		
		return abc;
		
		
		
		
		
	}
	
	
}
