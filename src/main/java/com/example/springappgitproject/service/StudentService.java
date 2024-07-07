package com.example.springappgitproject.service;

import org.springframework.stereotype.Service;

import com.example.springappgitproject.model.Student;

@Service
public class StudentService {
	
	public Student getStudent(long id) {
		System.out.println("Enter into Service:: getStudent ");
		Student s =new Student();
		s.setId(id);
		s.setName("srihari");
		return s;
	}

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Enter into Service:: saveStudent ");
		student.setId(100);
		student.setName("Jashwanth");
		return student;
	}

}
