package com.java.first;

public class BinarySearch {

	public static void main(String[] args) {
		searchElement(5);
	//	searchElement(11);
	}
	
	private static void searchElement(int ele) {
		// 1. Array should be in sorted Order in Binary Search
		//  2. get the mid value
		// 3. condition 1: if Mid values is equal to element - Element found
		//4. condition 2: if element is greater than Midval - make lower values = mid+1 and search start again
		//5. condition 3: if element is less than MidVal - make higher values=mid-1 and search start again
		//6. lower value should be less than higher value
		
		
		int[] a= {1,5,7,9,10,12,34,45};    // 1st statement
		
		
		
		int lowest=0;
		int highest=a.length-1;
		
		boolean flag=false;
		
		while(lowest<=highest) { //6 the statemennt
			
			int midVal= (lowest+highest)/2;		//2nd statement
			
			if(a[midVal]==ele) { //3rd statement
				
				System.out.println("element is found.." +a[midVal]);
				flag=true;
				break;
			}
			
			if(ele<a[midVal]) { //5th statement
				highest=midVal-1; 
			}
			
			if(ele>a[midVal]) { //4th statement
				lowest=midVal+1;
			}
		}
		
		if(flag==false) {
			System.out.println("Element Not found");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
