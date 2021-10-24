package com.ds.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] abc = { 4, 3, 6, 2, 1, 0, 5 };

		cycleSort(abc);
		System.out.println(Arrays.toString(abc));
	}

	static void cycleSort(int[] abc) {

		int n = abc.length;
		int i = 0;
		while (i < n) {
			int correct = abc[i];
			if (abc[i] != abc[correct]) {
				swap(abc, i, correct);
			} else {
				i++;
			}
		}
	}

	private static void swap(int[] abc, int first, int second) {
		int temp = abc[first];
		abc[first] = abc[second];
		abc[second] = temp;
	}

}
