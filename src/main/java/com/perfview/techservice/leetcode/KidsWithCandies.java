package com.perfview.techservice.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 	Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 *
 *	For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have
 *	the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
 *
 * @author vikram
 *
 */
public class KidsWithCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int max = 0;
		List<Boolean> result = new ArrayList<Boolean>();

		for (int i = 0; i < candies.length; i++) {
			if (max >= candies[i])
				continue;
			else
				max = candies[i];
		}
		System.out.println("max "+max);
		System.out.println();
		
		for (int i = 0; i < candies.length; i++) {
			System.out.println("max "+max);
			System.out.println("sum "+(candies[i]+extraCandies));
			
			if(max <= (candies[i]+extraCandies)) {
				result.add(true);
			}
			else {
				result.add(false);
			}
		}

		return result;
	}
	
	

}
