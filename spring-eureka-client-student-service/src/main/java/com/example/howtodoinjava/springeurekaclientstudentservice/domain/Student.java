package com.example.howtodoinjava.springeurekaclientstudentservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(value=Include.NON_DEFAULT)
public class Student implements Comparable<Student>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String className;
	@Column
	private String schoolName;
	@Column
	private Integer marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", schoolName=" + schoolName
				+ ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.getMarks().compareTo(this.getMarks());
	}
}
