package com.event.geru.leetcode;

/**
 * You're given strings jewels representing the types of stones that are jewels, and 
 * stones representing the stones you have. Each character in stones is a type of stone you have. 
 * You want to know how many of the stones you have are also jewels.
 * 
 * @author vikram
 *
 */
public class JewelsStones {
	
	    public int numJewelsInStones(String jewels, String stones) {
	    	int result=-1, count=0;
	    	
	    	for(int i=0; i < stones.length(); i++) {
	    		result = jewels.indexOf(stones.charAt(i));
	    		
	    		if(result != -1)
	    			count++;
	    	}
	    	
	    	return count;
	    }
	

}
