package com.java.first;

public class NumberOfDigit {

	public static void main(String[] args) {

	int num=35432635;
	int count=0; 
	
	
   while(num>0) {
	   num=num/10;
	   count++;
	   }	
	
	System.out.println("Number of Digit :" + count);
	
	}

}
