package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.StudentPage;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Page<Student> getStudents(StudentPage studentPage){
		Sort sort=Sort.by(studentPage.getSortDirection(), studentPage.getSortBy());
		Pageable pageable=PageRequest.of(studentPage.getPageNumber(), studentPage.getPageSize(),sort);
		return repo.findAll(pageable);
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
}
