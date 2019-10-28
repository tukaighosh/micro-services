package com.example.howtodoinjava.springeurekaclientstudentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.howtodoinjava.springeurekaclientstudentservice.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
