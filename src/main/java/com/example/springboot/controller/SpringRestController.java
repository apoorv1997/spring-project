package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @GetMapping("/")
    public String returnIndex() {
        return "Greetings!";
    }
}
