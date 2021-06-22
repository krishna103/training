package com.example.demo.ifaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {

	Page<Issue> findAll(Pageable pageable);
	
	Issue findById(int id);
}
