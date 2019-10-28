package com.example.howtodoinjava.springeurekaclientschoolservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.howtodoinjava.springeurekaclientschoolservice.util.Student;
import com.example.howtodoinjava.springeurekaclientschoolservice.util.StudentServiceProxy;

@RefreshScope
@RestController
public class SchoolServiceController {
	//@Autowired
	//RestTemplate restTemplate;
	@Autowired
	StudentServiceProxy studentServiceProxy;

	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public List<Student> getStudents(@PathVariable String schoolname) {
		System.out.println("Getting School details for " + schoolname);
		
		List<Student> response = studentServiceProxy.getStudents(schoolname);
		System.out.println("Response Received as " + response);

		return response;
	}

	/*@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
}
