package com.perfview.techservice.leecode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.perfview.techservice.leetcode.JewelsStones;

public class TestJewelsStones {

	@Test
	public void testValidData() {
				
		JewelsStones jewelsStones = new JewelsStones();
		int actual = jewelsStones.numJewelsInStones("aA", "aAAbbbb");
		
		Assertions.assertEquals(3, actual);
	}
	
	@Test
	public void testFailedData() {
				
		JewelsStones jewelsStones = new JewelsStones();
		int actual = jewelsStones.numJewelsInStones("z", "ZZ");
		
		Assertions.assertEquals(0, actual);
	}
}