package com.java.first;

import java.util.Arrays;

public class AlphabeticOrder {

	public static void main(String[] args) {
		
	//	Character in alphabetic order
		
	//	String name = "Rohit Singh is Don";  output: DRSghhiiinnoost
		
		String name = "ROHIT SINGH IS DON"; 
		String name1=null;
		
		
		  if(name.contains(" ")) { name1=name.replace(" ",""); }
		 
		  
		  char[] ch = name1.toCharArray(); 
		  Arrays.sort(ch); 
		  System.out.println(ch);
		  
		
	}

}
