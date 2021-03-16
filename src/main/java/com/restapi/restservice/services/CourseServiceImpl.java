package com.restapi.restservice.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapi.restservice.Dao.CourseDao;
import com.restapi.restservice.entity.Course;

@Service
@Component
public class CourseServiceImpl implements CourseService{
	
//	private List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		this.list = new ArrayList<>();
//		list.add(new Course(1,"Java","Core Java"));
//		list.add(new Course(2,"C","C basics"));
//		list.add(new Course(3,"Python","Python Programming"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	
	@Override
	public Course getCourseById(long id) {
//		Course course=null;
//		for(Course x:list)
//		{
//			if(x.getId()==id)
//			{
//				course=x;
//				break;
//			}
//		}
		return courseDao.getOne(id);
		
	}


	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
//		for(Course x:list)
//		{
//			if(x.getId()==course.getId())
//			{
//				x.setName(course.getName());
//				x.setDesc(course.getDesc());
//			}
//		}
		 courseDao.save(course);
		 return course;
	}


	@Override
	public void deleteById(long id) {
//		for(Course x:list)
//		{
//			if(x.getId()==id)
//			{
//				list.remove(x);
//				break;
//			}
//		}
//		Course entity=courseDao.getOne(id);
//		courseDao.delete(entity);
		courseDao.deleteById(id);
//		
	}



}
