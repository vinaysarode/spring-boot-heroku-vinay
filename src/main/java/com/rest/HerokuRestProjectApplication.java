package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuRestProjectApplication {
	
	@GetMapping("/")
	public String sayHiVinay() {
		return "From Heroku";
	}
	
	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input) {
		return "Hi this from Heroku :" + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HerokuRestProjectApplication.class, args);
	}

}
