package com.core.recursive;

public class NPower {
	
	public static void main(String args[]) {
		NPower npower = new NPower();
		System.out.println(npower.getNPower(2, 3));
	}
	
	public int getNPower(int x, int n) {
		if(n == 1)
			return x;
		return x* getNPower(x, n-1);
	}

}
