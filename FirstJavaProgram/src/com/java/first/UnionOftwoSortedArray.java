package com.java.first;

public class UnionOftwoSortedArray {

	public static void main(String[] args) {
		unionArray();
	}
	
	public static void unionArray() {
		
		int[] a= {1,2,3,4,5};
		int[] b = {1,2,3};
		int[] c;
		if(a.length > b.length) {
			c= new int[a.length];
		}else {
			c= new int[b.length];
		}
		
		
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length) {
			
		if(a[i] < b[j]) {
			c[k] = a[i];
			i++;
		}
		
		if(a[i] > b[j]) {
			c[k] = a[j];
			j++;
		}
		
		if(a[i] == b[j]) {
			c[k] = a[j];
			j++;
			i++;
		}
		k++;	
		}
		
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		
		
		while(j<b.length) {
			c[k]=a[j];
			j++;
			k++;
		}
		
		
	for (int k1 : c) {
		System.out.println(k1);
	}	
	
	System.out.println("Count is :  " + c.length);
		
		
		
		
		
		
		
	}

}
