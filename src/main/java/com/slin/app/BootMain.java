package com.slin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.slin.app.repository.PersonRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses=PersonRepository.class)
public class BootMain {

	public static void main(String[] args) {
		SpringApplication.run(BootMain.class, args);
	}

}
