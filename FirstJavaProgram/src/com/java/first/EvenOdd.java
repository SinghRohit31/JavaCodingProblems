package com.java.first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
	 Integer userInput= sc.nextInt();
	 System.out.println("User input is : "+userInput);
	 
	 if(userInput/2==0) {
		 System.out.println("Provided Number is even");
	 }else {
		 System.out.println("Provided Number is Odd");
	 }
	}

}
