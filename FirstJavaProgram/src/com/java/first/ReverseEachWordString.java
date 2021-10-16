package com.java.first;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String name="Rohit Singh";
		String[] str= name.split(" ");
		
		
		String addString=" ";
		
		for (String word : str) {
			
			String reverseWord="";
			
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord=reverseWord+word.charAt(i);
				}
			addString=addString+reverseWord+ " ";
			
		}
		
		System.out.println(addString);

	}

}
