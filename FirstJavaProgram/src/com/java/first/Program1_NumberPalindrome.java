package com.java.first;

public class Program1_NumberPalindrome {

	public static void main(String[] args) {
		int number = 1441;
		int temp=number; int rem,rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(rev==number) {
			System.out.println("Number is Palindrome  " + rev);
		}
		else System.out.println("Number is not Palindrome");
	}

}
