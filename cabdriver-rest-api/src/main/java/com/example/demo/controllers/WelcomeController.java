package com.example.demo.controllers;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import com.example.demo.daos.CabDriverDaoImpl;
import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@RestController
@CrossOrigin(origins = "*")
public class WelcomeController {

	@Autowired
	private CabDriverService service;
	
	@Value("${server.port}")
	private String info;
	
	@GetMapping(path = "/drivers")
	public List<CabDriver> findAll(){
		List<CabDriver> driverList=service.findAll();
		
		driverList.get(0).setRating(Integer.parseInt(info));
		
		return driverList;
	}
	
	@PostMapping(path = "/drivers")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CabDriver getAll( @RequestBody CabDriver driver) {
		return this.service.add(driver);
		}
}
