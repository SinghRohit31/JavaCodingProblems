package com.java.first;

public class ReverseString {

	public static void main(String[] args) {
		
		
// Using loop 
		
		String name="Rohit Singh";
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		System.out.println("reversed String is : " + rev);
		
//*************************************************************************************		
		StringBuffer name1=reverseString(name);
		System.out.println(name1);
		
	}
	
// Using Stringbuffer inbuild functions
	
	private static StringBuffer reverseString(String name) {
		StringBuffer buffer= new StringBuffer(name);
		return buffer.reverse();
	}
	
	
	
	
	
	

}
