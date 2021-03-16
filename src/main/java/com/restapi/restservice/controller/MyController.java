package com.restapi.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.entity.Course;
import com.restapi.restservice.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	//Demo function
	@GetMapping("/home")
	public String home() {
		return "this is homepage";
	}
	
	//Get courses 
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses() ;
	}
	
	//get course by Id
	@GetMapping("/courses/{courseId}")
	public Course getCourseById(@PathVariable String courseId)
	{
		return this.courseService.getCourseById(Long.parseLong(courseId));
	}
	
	//Post course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	//Update course
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	
	//Delete by Id
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> delete(@PathVariable String courseId)
	{
		try {
			this.courseService.deleteById(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
