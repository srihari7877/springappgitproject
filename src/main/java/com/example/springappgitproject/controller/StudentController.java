package com.example.springappgitproject.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/")
	public ResponseEntity<String> getStudentController(){
		return  new ResponseEntity<String>("Welcome to the project",HttpStatusCode.valueOf(200));
	}
}
