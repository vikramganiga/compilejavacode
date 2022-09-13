package com.core.recursive;

public class FibonacciSeries {

	public static void main(String args[]) {

		FibonacciSeries fibonacciSeries = new FibonacciSeries();

		System.out.println("Fibonacci Series with recursive apporach ");
		fibonacciSeries.getFibonacciSeries(0, 1, 4);
		System.out.println("Fibonacci Series with non-recursive apporach ");
		fibonacciSeries.getFibNonRecursive(4);
	}

	public void getFibonacciSeries(int firstSum, int secondSum, int n) {

		if (n == 0) {
			return;
		}

		int sum = firstSum + secondSum;

		System.out.println(n + " " + sum);

		System.out.println(n + " " + sum);
		getFibonacciSeries(secondSum, sum, n - 1);
	}

	/**
	 * this is without recursive
	 * 
	 * @param n
	 */
	public void getFibNonRecursive(int n) {

		int firstSum = 0, secondSum = 0, sum;

		for (int i = 0; i < n; i++) {

			if (i == 0) {
				firstSum = 0;
				System.out.println(i + " " + firstSum);
				continue;
			}

			if (i == 1) {
				secondSum = 1;
				System.out.println(i + " " + secondSum);
				continue;
			}

			sum = firstSum + secondSum;
			System.out.println(i + " " + sum);
			firstSum = secondSum;
			secondSum = sum;
		}

	}
}
