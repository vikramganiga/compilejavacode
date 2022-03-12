package com.perfview.techservice.ds.search;

public class LinearSearch {
	
	public static void main(String args[]) {
		
		int values[] = {10,20,30,2};
		int searchValue = 2;
		
		for(int i=0;i < values.length; i ++) {
			
			if (searchValue == values[i])
			{
				System.out.println("Found values at "+ i);
			}
		}
	}

}
