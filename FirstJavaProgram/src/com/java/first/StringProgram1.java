package com.java.first;

public class StringProgram1 {

	public static void main(String[] args) {
		String abc="a1b2c3d4";
		separateIntegerAndCharacter(abc);
		
	}
	
	static void separateIntegerAndCharacter(String abc) {
		 char[] ch=abc.toCharArray();
		 String str="";
		 String num="";
		 
		 
		 for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				num=num + ch[i];
			}
			else {
				str=str+ch[i];
			}
			
		}
		 
		 System.out.println("Character is " + str + " Number are " +num);
		 System.out.println("New Strings are  "+ (str+num));
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}
