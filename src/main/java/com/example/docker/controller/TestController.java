package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String hello() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX RETURN HELLO FROM CONTROLLER");
        return "<h1><font color=\"red\">Hello From Docker </font></h1>";
    }
}