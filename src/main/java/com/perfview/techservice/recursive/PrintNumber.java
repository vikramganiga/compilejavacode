package com.perfview.techservice.recursive;

public class PrintNumber{
	public static void main(String args[]){

			printNumber(5);
	}	

	public static void printNumber(int n){
		if(n==0)
			return;
		System.out.println(n);
		printNumber(n-1);
	}
}