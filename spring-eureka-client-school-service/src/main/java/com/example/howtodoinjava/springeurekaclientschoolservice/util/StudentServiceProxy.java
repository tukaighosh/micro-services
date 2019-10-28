package com.example.howtodoinjava.springeurekaclientschoolservice.util;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="student-service")
public interface StudentServiceProxy {
	 
	@RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}")
	public List<Student> getStudents(@PathVariable("schoolname") String schoolname);
	
}
