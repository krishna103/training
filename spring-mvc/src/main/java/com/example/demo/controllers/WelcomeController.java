package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daos.CabDriverDaoImpl;
import com.example.demo.entity.CabDriver;

@Controller
public class WelcomeController {

	@Autowired
	private CabDriver driver;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private CabDriverDaoImpl dao;
	
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("majHeading", "ola cab service");
		return "index";
	}
	
	@RequestMapping(path = "/addDrivers",method = RequestMethod.GET)
	public ModelAndView initForm(Model model) {
		mdlView.addObject("command",driver);
		mdlView.setViewName("/addDriver");
		return mdlView;
	}
	
	@RequestMapping(path = "/drivers",method = RequestMethod.GET)
	public String findAll(Model model) {
		List<CabDriver> driverList=dao.findAll();
		model.addAttribute("list",driverList);
		return "showDrivers";
	}
	
	@RequestMapping(path = "/drivers",method = RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("command") CabDriver driver,
			BindingResult result, Model model) {
		String nextPage="success";
		if(result.hasErrors()) {
			nextPage="addDriver";
		}else{
		int rowAdded=dao.add(driver);
		model.addAttribute("rowAdded",rowAdded);
		}
		return nextPage;
	}
}
