package com.perfview.techservice.ds.sorting;

public class CountingSort {

	public static void main(String args[]) {

		int input[] = { 1, 3, 4, 2, 3, 5 };

		System.out.println("before counting sort");

		for (int i = 0; i < input.length; i++) {
			System.out.println(" " + input[i]);
		}
		
		countingsort(input, 0,5);

		System.out.println("before counting sort");

		for (int i = 0; i < input.length; i++) {
			System.out.println(" " + input[i]);
		}
	}
	
	public static void countingsort(int[] input, int min, int max) {
		int countarry[] = new int[(max-min)+1];
		
		for (int i=0; i< input.length; i++) {
			countarry[input[i]-min]++;
		}
		
		int j =0;
		
		for(int i =min; i <= max; i++) {
			while(countarry[i -min] > 0) {
				input[j++] =i;
				countarry[i - min]--;
			}
		}
		
	}
}
