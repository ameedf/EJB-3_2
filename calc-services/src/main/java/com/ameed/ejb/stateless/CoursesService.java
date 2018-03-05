package com.ameed.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import com.ameed.jpa.entities.Course;

@Local
public interface CoursesService {

	List<Course> listAll();

	Course createNew(String name, String lecturer, String language, Float average);

}