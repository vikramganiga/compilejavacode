package com.core.ds.sorting;

public class QuickSort {

	public static void main(String args[]) {

		int array[] = { 10, 20, 89, 16 };

		System.out.println("Array Before Sort");

		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);

		divide(array, 0, array.length - 1);

		System.out.println("\n Array After Sort");

		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);

	}

	public static void divide(int[] input, int low, int high) {

		if (low < high) {
			int pi = partition(input, low, high);
			divide(input, low, pi - 1);
			divide(input, pi + 1, high);
		}
	}

	public static int partition(int[] input, int low, int high) {
		int pivot = input[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (input[j] < pivot) {
				i++;
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}

		i++;
		int temp = input[i];
		input[i] = input[high];
		input[high] = temp;

		return i;
	}
}
