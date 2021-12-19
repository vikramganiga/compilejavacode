package com.perfview.techservice.leecode;

import com.perfview.geru.leetcode.DefangingIPAddress;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDefanging {
	
	@Test
    public void validData() {
		
		DefangingIPAddress defangingIPAddress = new DefangingIPAddress();
		String results =defangingIPAddress.defangIPaddr("10.1.10.1");
		
		Assertions.assertEquals(new String("10[.]1[.]10[.]1"),  results);
		
	}

	//255.100.50.0
	
	@Test
    public void valid2Data() {
		
		DefangingIPAddress defangingIPAddress = new DefangingIPAddress();
		String results =defangingIPAddress.defangIPaddr("255.100.50.0");
		
		Assertions.assertEquals(new String("255[.]100[.]50[.]0"),  results);
		
	}
}
