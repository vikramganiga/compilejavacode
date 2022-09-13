package com.core.recursive;

public class PrintNumber {
	public static void main(String args[]) {

		//System.out.println("Print number in reverse");
		//printNumberInReverse(5);
		System.out.println("Print number");
		printNumber(5, 1);
	}

	public static void printNumberInReverse(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printNumberInReverse(n - 1);
	}
	
	public static void printNumber(int n,int i) {
		if (i == n)
			return;
		System.out.println(i++);
		printNumber(n, i);
	}

	
}