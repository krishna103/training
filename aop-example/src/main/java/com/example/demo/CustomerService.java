package com.example.demo;

import org.springframework.stereotype.Service;

//import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j
public class CustomerService {

	public String findById(int id) {
		//log.info("findById method called");
		return "Ramesh";
	}
	public String[] findAll() {
		//log.info("find all method called");
		return new String[]{"manish","suresh","ramesh","magesh"};
	}
}
