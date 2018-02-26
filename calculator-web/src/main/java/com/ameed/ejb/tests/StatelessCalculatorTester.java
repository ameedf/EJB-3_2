package com.ameed.ejb.tests;

import java.util.Random;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ameed.ejb.stateless.StatelessCalculator;

@Path("/stateless")
public class StatelessCalculatorTester {
	@EJB(mappedName = "calcWithoutResult")
	private StatelessCalculator calculator;
	
	@Path("/test")
	@GET
	public void test() throws NamingException {
		Random random = new Random();
		for (int i = 0; i < 300; i++) {
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int result = calculator.add(a, b);
			System.out.println(a + " + " + b + " = " + result);
		}
	}
}
