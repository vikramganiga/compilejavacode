package com.perfview.techservice.java8.behavior.parameterization;

import com.perfview.techservice.java8.Apple;

public class AppleColorPrinter implements AppleFormatter {

	@Override
	public String print(Apple apple) {
		return apple.getColor();
	}
}
