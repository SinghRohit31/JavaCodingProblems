package com.java.first;

public class IntersectOfArray {

	public static void main(String[] args) {

	}

	public static void IntersectArray() {
		int[] a= {1,2,3,4,5};
		int[] b = {1,2,3};
		int[] c= new int[a.length +b.length];
		int i=0;
		int j=0;
		int k=0;
		
		while (i < a.length && j< b.length) {
			if(a[i] == b[j]) {
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
		}
		
		while(i<a.length) {
			if(a[i] == b[j]) {
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
		}
		
		while(i<b.length) {
			if(a[i] == b[j]) {
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
		}
		
		for (int k1 : c) {
			System.out.println(k1);
		}	
		
		System.out.println("Count is :  " + c.length);
	}
	 
	
}
