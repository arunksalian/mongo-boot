package com.slin.app.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slin.app.data.Person;
import com.slin.app.repository.PersonRepository;

@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	@ResponseBody
	public String addPerson () {
		final Person ma = new Person("Ma", "Jo", LocalDateTime.now(), "Winner", 100);		
		try {
			personRepository.save(ma);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "person added"+ma.getFirstName();
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	@ResponseBody
	public String delete () {
		return "person added";
	}
}
