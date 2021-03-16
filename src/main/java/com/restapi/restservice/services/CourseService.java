package com.restapi.restservice.services;

import java.util.List;

import com.restapi.restservice.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourseById(long id);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteById(long id);
}

