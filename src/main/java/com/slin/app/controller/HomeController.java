package com.slin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slin.app.repository.PersonRepository;

@Controller
@RequestMapping("/api")
public class HomeController {

	private PersonRepository personRep; 
	
	@RequestMapping("/home")
	@ResponseBody
	public String getHome () {
		return "Welcome";
	}
	

}
