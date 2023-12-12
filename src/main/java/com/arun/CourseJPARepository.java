package com.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class CourseJPARepository 
{
	
	@Autowired
	private EntityManager entity;
	
	public void insert(Course course)
	{
		entity.merge(course);
	}
	
	public Course select(long id)
	{
		return entity.find(Course.class, id);
	}
	
	public void delete(long id)
	{
		Course course=entity.find(Course.class, id);
		entity.remove(course);
	}
	
	

}
