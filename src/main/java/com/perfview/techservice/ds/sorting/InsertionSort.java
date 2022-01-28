package com.perfview.techservice.ds.sorting;

/**
 * Sorting start from left to right, by placing comparing one by one, replacing
 * sorted one. stable sort O(n^2) time complexity - quadratic
 */

public class InsertionSort {

	public static void main(String args[]) {

		int input[] = { 10, -2, 2, 34, 31, -1, 55 };
		
		recursiveSort(input,input.length-1);
		sort(input);

	}

	public static void recursiveSort(int[] input, int numItems) {

		if (numItems < 2) {
			return;
		}

		recursiveSort(input, numItems - 1);

		int newElement = input[numItems - 1];
		int i;

		for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
			input[i] = input[i - 1];
		}

		input[i] = newElement;

		System.out.println("Result of call when numItems = " + numItems);

		for (i = 0; i < input.length; i++) {
			System.out.print(" " + input[i]);
		}
		System.out.println();

	}

	public static void sort(int[] input) {

		System.out.println("before insertion sort");

		for (int i = 0; i < input.length; i++) {
			System.out.println(" " + input[i]);
		}

		for (int i = 1; i < input.length; i++) {
			int cmp = input[i];
			int j;
			for (j = i; j > 0 && input[j - 1] > cmp; j--) {
				input[j] = input[j - 1];
			}
			input[j] = cmp;

		}

		System.out.println("after insertion sort");

		for (int i = 0; i < input.length; i++) {
			System.out.println(" " + input[i]);
		}
	}
}