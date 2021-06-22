package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CabDriver;
import com.example.demo.ifaces.ICabDriver;

@Service
public class CabDriverService {

	@Autowired
	private ICabDriver repo;
	public List<CabDriver> findAll(){
		return this.repo.findAll();
	}
	public CabDriver add(CabDriver entity) {
		return this.repo.save(entity);
	}
}
