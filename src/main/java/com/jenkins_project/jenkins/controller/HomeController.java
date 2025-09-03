package com.jenkins_project.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String Greeting(){
        return "Hello Buddy <br> <h1>Welcome to my app....</h1>";
    }
}
