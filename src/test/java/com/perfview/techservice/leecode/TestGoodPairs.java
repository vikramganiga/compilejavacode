package com.perfview.techservice.leecode;

import com.perfview.geru.leetcode.GoodPairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGoodPairs {
	
	@Test
    public void validData() {
		
		GoodPairs goodPairs = new GoodPairs();
		int results =goodPairs.numIdenticalPairs(new int[] {1,2,3,1,1,3});
		
		Assertions.assertEquals(4,  results);
		
	}
	
	@Test
    public void validData2() {
		
		GoodPairs goodPairs = new GoodPairs();
		int results =goodPairs.numIdenticalPairs(new int[] {1,1,1,1});
		
		Assertions.assertEquals(6,  results);
		
	}
	
	@Test
    public void validData3() {
		
		GoodPairs goodPairs = new GoodPairs();
		int results =goodPairs.numIdenticalPairs(new int[] {1,2,3});
		
		Assertions.assertEquals(0,  results);
		
	}

}
