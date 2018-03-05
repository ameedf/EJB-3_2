package com.ameed.ejb.stateless;

import javax.ejb.Stateless;

@Stateless(name = "calcWithoutResult")
public class StatelessCalculatorImpl implements StatelessCalculator {

	@Override
	public int add(int a, int b) {
		System.out.println("in " + this.toString() + " : adding 2 numbers");
		return a + b;
	}

}
