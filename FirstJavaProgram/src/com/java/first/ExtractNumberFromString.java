package com.java.first;

public class ExtractNumberFromString {

	public static void main(String[] args) {
			String str="Mu Name is 1235 Nmae897";
			
			char[] ch= str.toCharArray();
			
			int sum=0;
			
			for (int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i])) {
					System.out.println(ch[i]);
					
					int number =Character.getNumericValue(ch[i]);   // converting char to number
					
					sum=sum+number;
					
				}
			}
			
			System.out.println("Sum of all numbers are " + sum);
	}

}
