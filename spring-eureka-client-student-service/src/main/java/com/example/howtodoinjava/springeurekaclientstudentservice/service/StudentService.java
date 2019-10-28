package com.example.howtodoinjava.springeurekaclientstudentservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.howtodoinjava.springeurekaclientstudentservice.dao.StudentRepository;
import com.example.howtodoinjava.springeurekaclientstudentservice.domain.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	public Student getStudentWithHighestMarks()
	{
		Student bestStudent = null;
		List<Student> studentList = studentRepo.findAll();
		bestStudent = studentList.parallelStream().sorted().findFirst().get();
		return bestStudent;
	}
	
	public List<Student> getStudentsBySchoolName(String schoolName)
	{
		List<Student> selectedStudents = new ArrayList<Student>();
		List<Student> studentList = studentRepo.findAll();
		selectedStudents = studentList.parallelStream().
				filter(s->s.getSchoolName().equalsIgnoreCase(schoolName)).collect(Collectors.toList());
		return selectedStudents;
	}
	
	public Student addStudent(Student student)
	{
		return studentRepo.saveAndFlush(student);
	}
}
