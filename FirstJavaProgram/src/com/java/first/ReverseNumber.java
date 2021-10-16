package com.java.first;

public class ReverseNumber {

	public static void main(String[] args) {
		int number= 12345;
		
		int temp=number;int rem;
		int rev=0;
		
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
		}
		
		System.out.println(rev);
		
		
		

	}

}
