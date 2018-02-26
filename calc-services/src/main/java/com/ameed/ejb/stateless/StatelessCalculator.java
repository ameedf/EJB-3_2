package com.ameed.ejb.stateless;

import javax.ejb.Local;

@Local
public interface StatelessCalculator {
	// return a + b
	public int add(int a, int b);
}
