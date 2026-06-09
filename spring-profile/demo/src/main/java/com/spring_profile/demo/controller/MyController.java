package com.spring_profile.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${my.app.name}")
    private String applicationName;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to " + applicationName;
    }
}
