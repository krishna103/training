package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Issue;
import com.example.demo.service.IssueService;

@RestController
@CrossOrigin(origins = "*")
public class IssueController {

	@Autowired
	private IssueService service;
	
	@GetMapping(path="/api/rest/issues/{pageSize}/{pageNum}")
	public List<Issue> findAll(@PathVariable("pageSize") Integer pageSize,
			@PathVariable("pageNum") Integer pageNum)
	{
		return service.findAll(pageNum, pageSize);
	}
	
	@GetMapping(path = "/api/rest/issues/{issue_id}")
	public Issue findById(@PathVariable("issue_id") int id) {
		return service.findById(id);
	}
	
	@PostMapping(path = "/api/rest/issues")
	public Issue add(@RequestBody Issue issue) {
		return this.service.add(issue);
	}
}
