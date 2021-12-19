package com.perfview.techservice.leecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.perfview.techservice.leetcode.RichestCustomer;

public class RichestCustomerTest {

	@Test
	public void validData() {
		RichestCustomer richestCustomer = new RichestCustomer();
		
		Assertions.assertEquals(17, richestCustomer.maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));
				
	}
}
