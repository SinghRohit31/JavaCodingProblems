package com.java.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SecondHighestFromArray {

	public static void main(String[] args) {
		int[] a = {4,12,33,44,12,23,4,5,12};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		System.out.println(a[0]);
		
		
		System.out.println("******************Print All element in Array*****************************");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
}
}