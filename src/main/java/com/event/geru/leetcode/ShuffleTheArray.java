package com.event.geru.leetcode;

/**
 * 
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * @author vikram
 *
 */
public class ShuffleTheArray {

	public int[] shuffle(int[] nums, int n) {
        
		
		int[] result = new int[nums.length];
		int startpointer = 0;
		int nof2pointer = nums.length/2;
		
		for(int i=0; startpointer < nof2pointer && nof2pointer < nums.length; nof2pointer++, startpointer++) {
			result[i] = nums[startpointer];
			result[i+1] = nums[nof2pointer];
			i=i+2;
		}
		
		return result;
    }
}
