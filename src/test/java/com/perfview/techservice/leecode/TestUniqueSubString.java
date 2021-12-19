package com.perfview.techservice.leecode;

import com.perfview.geru.leetcode.UniqueSubString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUniqueSubString {
	
	@Test
	public void testEmptyString()
	{
		Assertions.assertEquals(new Long(0),  new Long(UniqueSubString.getSubString("")));
		
	}
	
	@Test
	public void testEmpty()
	{
		Assertions.assertEquals(new Long(1),  new Long(UniqueSubString.getSubString(" ")));
		
	}
	@Test
	public void testRepeatedString()
	{
		Assertions.assertEquals(new Long(4),  new Long(UniqueSubString.getSubString("abbzbcnc")));
		
	}
	@Test
	public void testUniqueString()
	{
		Assertions.assertEquals(new Long(5),  new Long(UniqueSubString.getSubString("qwert")));
		
	}
	
}
