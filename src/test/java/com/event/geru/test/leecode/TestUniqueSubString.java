package com.event.geru.test.leecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.event.geru.leetcode.UniqueSubString;

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
