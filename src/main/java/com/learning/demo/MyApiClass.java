package com.learning.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiClass {

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
