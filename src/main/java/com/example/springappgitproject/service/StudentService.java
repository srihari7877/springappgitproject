package com.example.springappgitproject.service;

import org.springframework.stereotype.Service;

import com.example.springappgitproject.model.Student;

@Service
public class StudentService {
	
	public Student getStudent(long id) {
		Student s =new Student();
		s.setId(id);
		s.setName("srihari");
		return s;
	}

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return student;
	}

}
