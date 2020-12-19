package com.event.geru.leetcode;

public class RichestCustomer {

	public int maximumWealth(int[][] accounts) {
		int rich = 0, sum = 0;

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length; j++) {
				sum += accounts[i][j];
			}

			if (rich < sum)
				rich = sum;
			sum = 0;
		}

		return rich;
	}

	public static void main(String args[]) {
		RichestCustomer richestCustomer = new RichestCustomer();
		System.out.println(richestCustomer.maximumWealth(new int[][] { { 1, 2 }, { 2, 3 } }));
	}

}
