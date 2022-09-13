package com.core.java8.behavior.parameterization;

import com.core.java8.Apple;

public class AppleColorPrinter implements AppleFormatter {

	@Override
	public String print(Apple apple) {
		return apple.getColor();
	}
}
