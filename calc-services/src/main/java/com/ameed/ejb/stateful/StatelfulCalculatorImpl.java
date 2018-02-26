package com.ameed.ejb.stateful;

import javax.ejb.Stateful;

@Stateful(name = "calcWithResult")
public class StatelfulCalculatorImpl implements StatefulCalculator {

	private int result;

	@Override
	public int add(int a) {
		System.out.println("in" + this.toString() + " : adding one number to the inner result");
		this.result += a;
		return result;
	}

	@Override
	public int getResult() {
		return this.result;
	}

}
