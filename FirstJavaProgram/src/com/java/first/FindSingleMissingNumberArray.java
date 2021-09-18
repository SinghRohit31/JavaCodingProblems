package com.java.first;

public class FindSingleMissingNumberArray {

	public static void main(String[] args) {
		int[] abc= {1,2,3,4,6};
		
		int len= abc.length;
		
		System.out.println(findMissingNumber(abc, len));
	}
	
	public static int findMissingNumber(int[] abc,int len) {
		int sum= len * (len+1)/2;
		int results=0;
		
		for(int i=0 ; i<abc.length-1;i++) {
			results=results+abc[i];
		}
		
		return sum-results;
		
	}

}
