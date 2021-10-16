package com.java.first;

public class AddingWithoutUsingArithmatic {

	public static void main(String[] args) {
		System.out.println(addNumbers(10, 5));
	}

	
	private static int addNumbers(int a ,int b) {
		
		for(int i=0;i<b; i++) {
			a++;
		}
		
		return a;
		
	}
	
	
}
