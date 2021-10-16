package com.java.first;

public class StringProgram2 {

	public static void main(String[] args) {
		String abc="a1b2c3d4";
		ChangePosition(abc);
		
	}

	
	private static void ChangePosition(String abc) {
		
		char[] ch=abc.toCharArray();
		
		char temp;
		for (int i = 0; i < ch.length; i+=2) {
					
			temp=ch[i+1];
			ch[i+1]=ch[i];
			ch[i]=temp;
			
		}
		
		System.out.println(ch);
		
	
		
		
		
	}
	
	
	
}
