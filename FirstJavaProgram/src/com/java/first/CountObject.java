package com.java.first;

public class CountObject {

	private static int i ;;
	

	/*
	 * public CountObject() { i++; }
	 * 
	 * 
	 * 
	 * public CountObject(String string) { i++; }
	 */



	public static void main(String[] args) {
		CountObject cb=new CountObject();
		
		CountObject cb1=new CountObject();
		
	//	CountObject cb2=new CountObject("Rahul");
		System.out.println("Number of Objects created  "+ i);
	}

}
