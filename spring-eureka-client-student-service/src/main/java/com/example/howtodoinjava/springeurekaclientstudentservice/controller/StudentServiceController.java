package com.example.howtodoinjava.springeurekaclientstudentservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.howtodoinjava.springeurekaclientstudentservice.domain.Student;
import com.example.howtodoinjava.springeurekaclientstudentservice.service.StudentService;

@RestController
public class StudentServiceController {
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List<Student> getStudents(@PathVariable String schoolname) {
		System.out.println("Getting Student details for " + schoolname);

		List<Student> studentList = studentService.getStudentsBySchoolName(schoolname);
		if (studentList == null) {
			studentList = new ArrayList<Student>();
		}
		return studentList;
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		System.out.println("Adding new student: "+student);

		return studentService.addStudent(student);
	}
}
