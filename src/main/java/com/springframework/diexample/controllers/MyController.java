package com.springframework.diexample.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello");
        return "hello";
    }
}
