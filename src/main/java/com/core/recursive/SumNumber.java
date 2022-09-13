package com.core.recursive;

public class SumNumber {

	public static void main(String args[]) {
		SumNumber sumNumber = new SumNumber();
		System.out.println(" " +sumNumber.sum(6));
		
	}
	
	public int sum(int n)
	{
		if (n == 0)
			return 0;
		return sum(n-1)+n;
	}
}
