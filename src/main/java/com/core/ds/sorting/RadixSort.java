package com.core.ds.sorting;

public class RadixSort {

	public static void main(String args[]) {
		int input[] = { 12, 29, 40, 12, 11 };

		System.out.println("\n Before sort");

		for (int i = 0; i < input.length; i++) {
			System.out.print(" " + input[i]);
		}

		radixSort(input,10, 2 );
		
		System.out.println("\n After sort");

		for (int i = 0; i < input.length; i++) {
			System.out.print(" " + input[i]);
		}

	}
	
	public static void radixSort(int[] input, int radix, int width) {
		for(int i=0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}
	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for(int value:input) {
			countArray[getDigit(position, value, radix)]++;
		}
		
		for(int j=1; j <radix; j++) {
			countArray[j] += countArray [j-1];
		}
		
		int temp[] = new int[numItems];
		for( int tempIndex = numItems -1; tempIndex >=0 ;tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		
		for(int tempIndex =0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) %radix;
	}

}
