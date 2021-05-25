package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	public CourseServiceimpl() {
		

	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	
//	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId() !=parseLong).collect(Collector.toList());
//	}
	public Course deleteCourse(Course course) {
//		list.remove(course);
		return null;
	}
	


}
