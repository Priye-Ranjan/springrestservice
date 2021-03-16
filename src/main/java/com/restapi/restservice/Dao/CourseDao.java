package com.restapi.restservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restservice.entity.Course;


public interface CourseDao extends JpaRepository<Course, Long>{

}
