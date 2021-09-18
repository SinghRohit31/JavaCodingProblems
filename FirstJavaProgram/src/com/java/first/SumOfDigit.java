package com.java.first;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num=12345;
		
		int add=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			add=add+rem;
			num=num/10;
		}
		
		System.out.println("Adding of numbers are : " + add);
	}

}
