package com.java.first;

public class NoOfOddeven {

	public static void main(String[] args) {
		int num=354326358;
		
		int countEven=0,countOdd=0;
		int rem=0;
		
		while(num>0) {
			
			rem=num%10;
			if(rem%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
			num=num/10;
			
		}
		
	System.out.println("Even count is  "+countEven + "   Odd count is  "+ countOdd);	
		
		
	}

}
