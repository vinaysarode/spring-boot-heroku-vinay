package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuRestProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(HerokuRestProjectApplication.class, args);
	}

}
