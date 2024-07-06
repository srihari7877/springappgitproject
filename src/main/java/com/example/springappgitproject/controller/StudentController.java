package com.example.springappgitproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springappgitproject.model.Student;
import com.example.springappgitproject.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public ResponseEntity<String> getStudentController(){
		System.out.println("Enter into Student contoller:::::::::::");
		return  new ResponseEntity<String>("Welcome to the project",HttpStatusCode.valueOf(200));
	}
	@GetMapping("/getstudent")
	public ResponseEntity<Student> getStudent(@RequestParam("id") long id){
		System.out.println("Enter into getStudent:::::::::::");
		return  new ResponseEntity<Student>(studentService.getStudent(id),HttpStatusCode.valueOf(200));
	}
}
