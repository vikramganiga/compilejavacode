package com.perfview.techservice.leetcode;

import java.util.List;

public class RunSolution {
	
	public static void main(String args[]) {
		
		//Kids with Candies
		KidsWithCandies kidsWithCandies = new KidsWithCandies();
		List<Boolean> results= kidsWithCandies.kidsWithCandies(new int[] {2,3,5,1,3}, 3);
		//System.out.println(results);
		
		//Shuffle the Array
		ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
		int result[]=shuffleTheArray.shuffle(new int[] {2,5,1,3,4,7}, 3);
		
		for(int i=0; i < result.length; i++) {
			System.out.println(" "+result[i]);
		}
	}

}
