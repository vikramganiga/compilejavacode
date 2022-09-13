package com.core.recursive;

public class Factorial {
	
	public static void main(String args[]) {
		Factorial factorial = new Factorial();
		System.out.println("Factorial Result = "+factorial.getFactorial(4));
	}
	
	public int getFactorial(int n) {
		
		if(n==1)
			return 1;
		return getFactorial(n-1)*n;
	}

}
