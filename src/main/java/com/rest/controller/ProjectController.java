package com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/")
    public String sayHiVinay() {
        return "Welcome to Heroku";
    }

    @GetMapping("/message/{input}")
    public String getMessage(@PathVariable String input) {
        return "Changes from Git :" + input;
    }

}
