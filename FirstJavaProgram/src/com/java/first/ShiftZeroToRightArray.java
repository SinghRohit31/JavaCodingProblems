package com.java.first;

import java.util.Arrays;

public class ShiftZeroToRightArray {

	public static void main(String[] args) {
		int[] a= {1,0,2,0,0,3,4,0};
		
		System.out.println(Arrays.toString(shiftToRight(a)));
	}

	
    private static int[] shiftToRight(int[] a) {
    	int[] abc = new int[a.length];
    	
    	int count=0;
    	
    	for (int i : a) {
			if(i !=0) {
				abc[count]=i;
				count++;
			}
			
		}
    	
    	return abc;
    	
    	
    }
	
	
}
