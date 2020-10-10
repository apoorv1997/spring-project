package com.example.springboot.service.impl;

import com.example.springboot.service.SpringRestService;

public class SpringRestServiceImpl implements SpringRestService {

    public String getIndex() {
        return "Hello";
    }
}
