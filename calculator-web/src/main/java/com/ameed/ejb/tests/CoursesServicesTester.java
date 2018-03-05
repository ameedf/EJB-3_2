package com.ameed.ejb.tests;

import java.util.List;
import java.util.Random;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ameed.ejb.stateless.CoursesService;
import com.ameed.ejb.stateless.StatelessCalculator;
import com.ameed.jpa.entities.Course;

@Path("/stateless")
public class CoursesServicesTester {
	@EJB(mappedName = "coursesService")
	private CoursesService services;
	
	@Path("/courses")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> test() throws NamingException {
		return services.listAll();
	}
}
