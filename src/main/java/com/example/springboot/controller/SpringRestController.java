package com.example.springboot.controller;

import com.example.springboot.service.SpringRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @Autowired
    private SpringRestService springRestService;

    @GetMapping("/")
    public String returnIndex() {
        String index = springRestService.getIndex();
        return index;
    }
}
