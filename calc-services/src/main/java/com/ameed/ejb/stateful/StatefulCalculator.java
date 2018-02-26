package com.ameed.ejb.stateful;

import javax.ejb.Local;

@Local
public interface StatefulCalculator {
	// return a + the internal result
	public int add(int a);
	
	public int getResult();
}
