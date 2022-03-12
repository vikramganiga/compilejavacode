package com.perfview.techservice.ds.search;


public class BinearySearch {

	public static void main(String args[]) {
		int sortedArry[] = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Search value " + search(sortedArry, 20));
	}

	public static int search(int[] input, int searchValue) {
		int start = 0;
		int end = input.length;

		while (start < end) {
			int mid = (start + end) / 2;

			if (input[mid] == searchValue) {
				return mid;
			} else if (input[mid] < searchValue) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return -1;

	}

}
