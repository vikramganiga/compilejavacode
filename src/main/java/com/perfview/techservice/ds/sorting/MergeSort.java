package com.perfview.techservice.ds.sorting;

public class MergeSort {

	public static void main(String args[]) {

		int array[] = { 10, 20, 89, 16 };

		System.out.println("Array Before Sort");

		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);

		mergeSort(array, 0, array.length - 1);

		System.out.println("\n Array After Sort");

		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);
	}

	private static void mergeSort(int[] input, int startIndex, int endIndex) {

		if (startIndex >= endIndex)
			return;

		int midIndex = (startIndex + endIndex) / 2;

		mergeSort(input, startIndex, midIndex);
		mergeSort(input, midIndex + 1, endIndex);
		sort(input, startIndex, midIndex, endIndex);

	}

	private static void sort(int[] input, int startIndex, int midIndex, int endIndex) {

		int mergeArray[] = new int[endIndex - startIndex + 1];

		int firstIndex = startIndex;
		int secondIndex = midIndex + 1;
		int mergeIndex = 0;

		while (firstIndex <= midIndex && secondIndex <= endIndex) {
			if (input[firstIndex] <= input[secondIndex]) {
				mergeArray[mergeIndex++] = input[firstIndex++];
			} else {
				mergeArray[mergeIndex++] = input[secondIndex++];
			}

		}

		while (firstIndex <= midIndex) {
			mergeArray[mergeIndex++] = input[firstIndex++];
		}

		while (secondIndex <= endIndex) {
			mergeArray[mergeIndex++] = input[secondIndex++];
		}

		for (int i = 0, j = startIndex; i < mergeArray.length; i++, j++) {
			input[j] = mergeArray[i];
		}

	}

}
