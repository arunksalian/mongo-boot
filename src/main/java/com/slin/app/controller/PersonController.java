package com.slin.app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String addPerson (@RequestParam("firstName")String firstName) {
		final Person ma = new Person(firstName, "Jo", LocalDateTime.now(), "Winner", 100);		
		try {
			personRepository.save(ma);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "person added"+ma.getFirstName();
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public List<Person> delete () {
		return personRepository.findAll();
	}
}
