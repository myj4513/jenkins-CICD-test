package com.study.jenkinspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    
    @GetMapping("/hello2")
    public String hello2() {
        return "Hello World2!";
    }
    
    @GetMapping("/hello3")
    public String hello3() {
        return "Hello World3!";
    }
    
    @GetMapping("/hello4")
    public String hello4() {
        return "Hello World4!";
    }
    
    @GetMapping("/hello5")
    public String hello5() {
        return "Hello World5!";
    }
    
    @GetMapping("/hello6")
    public String hello6() {
        return "Hello World6!";
    }
}
