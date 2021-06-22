package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.IssueRepository;
import com.example.demo.model.Issue;

@Service
public class IssueService {
	
	@Autowired
	private IssueRepository repo;
	
	public List<Issue> findAll(int pageNum,int pageSize){
		Pageable pageable=PageRequest.of(pageNum, pageSize);
		
		Page<Issue> page=this.repo.findAll(pageable);
		
		if(page.hasContent()) {
			return page.getContent();
		}else {
			return new ArrayList<Issue>();
		}
	}
	
	public Issue findById(int id) {
		return this.repo.findById(id);
	}
	
	public Issue add(Issue issue) {
		return this.repo.save(issue);
	}

}
