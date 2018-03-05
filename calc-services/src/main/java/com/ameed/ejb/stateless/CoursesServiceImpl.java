package com.ameed.ejb.stateless;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.ameed.jpa.entities.Course;

@Stateless(name = "courses")
public class CoursesServiceImpl implements CoursesService {

	@PersistenceContext(unitName = "my-pu")
	private EntityManager entityManager;

	@Override
	public List<Course> listAll() {
		String sql = "select c from Course c";
		TypedQuery<Course> query = entityManager.createQuery(sql, Course.class);
		List<Course> courses = query.getResultList();
		return courses;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Course createNew(String name, String lecturer, String language, Float average) {
		Course course = new Course(null, name, null, language, average);
		entityManager.persist(course);
		return course;

	}
}
