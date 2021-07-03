package com.xoriant.SampleSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Controller {
	@GetMapping("/add")
	public String addSomething() {
		return "something is added";
	}
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("Home");        
		return modelAndView;    
	}
	
	@GetMapping("/delete")
	public String deleteSomething() {
		return "something is deleted";
	}
	
	@GetMapping("/modify")
	public String modifySomething() {
		return "something is modified";
	}
	
}
