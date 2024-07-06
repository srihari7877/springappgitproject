package com.example.springappgitproject.service;

import org.springframework.stereotype.Service;

import com.example.springappgitproject.model.Student;

@Service
public class StudentService {
	
	public Student getStudent(long id) {
		Student s =new Student();
		s.setId(1);
		s.setName("srihari");
		return s;
	}

}
