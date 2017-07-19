package com.slin.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.slin.app.data.Person;

public interface PersonRepository extends MongoRepository<Person, String>{

	List<Person> findBySalary(final int salary);
}
