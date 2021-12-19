package com.perfview.techservice.java8.behavior.parameterization;

import com.perfview.techservice.java8.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {

		return apple.getWeight() > 150;
	}

}
