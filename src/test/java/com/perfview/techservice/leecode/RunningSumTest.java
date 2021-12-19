package com.perfview.techservice.leecode;

import com.perfview.geru.leetcode.RunningSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumTest {
	
	@Test
    public void validData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {0,3,2,2});
		
		Assertions.assertArrayEquals(new int[] {0,3,5,7},  results);
		
	}
	
	@Test
    public void validRepeatedData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {1,1,1,1,1});
		
		Assertions.assertArrayEquals(new int[] {1,2,3,4,5},  results);
		
	}
	
	@Test
    public void validComplextData() {
		
		RunningSum runningSum = new RunningSum();
		int results[] =runningSum.runningSum(new int[] {3,1,2,10,1});
		
		Assertions.assertArrayEquals(new int[] {3,4,6,16,17},  results);
		
	}
	
}
