package com.ameed.ejb.tests;

import java.util.Random;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ameed.ejb.stateful.StatefulCalculator;

@Path("/stateful")
public class StatefulCalculatorTester {
	@EJB(mappedName = "calcWithResult")
	private StatefulCalculator calculator;
	
	@Path("/test")
	@GET
	public void test() throws NamingException {
		Random random = new Random();
		for (int i = 0; i < 300; i++) {
			int a = random.nextInt(100);
			int oldResult = calculator.getResult();
			calculator.add(a);
			int newResult = calculator.getResult();
			System.out.println(a + " + " + oldResult + " = " + newResult);
		}
	}
}
