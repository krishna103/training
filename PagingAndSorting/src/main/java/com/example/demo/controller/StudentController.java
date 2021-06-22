package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.StudentPage;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping
	public ResponseEntity<Page<Student>> getStudents(StudentPage studentPage){
		return new ResponseEntity<>(service.getStudents(studentPage), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Student> addStudent(Student student){
		return new ResponseEntity<>(service.addStudent(student),HttpStatus.OK);
	}
}
