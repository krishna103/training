package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.DriverReview;

@Service
public class ReviewService {
	
	@Autowired(required = false)
	@Qualifier(value = "review1")
	private DriverReview review;
	@Autowired
	private List<DriverReview> list;
	
	public void setReview(DriverReview review) {
		this.review=review;
	}
	
	public DriverReview getReview()
	{
		return this.review;
	}
	
	public List<DriverReview> getReviewList(){
		return this.list;
	}
}
