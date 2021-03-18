package com.example.demo.dummyproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  @RequestMapping("/")
  public String helloController() {
    return "Hello world!";
  }
}
