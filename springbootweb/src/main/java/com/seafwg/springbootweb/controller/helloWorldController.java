package com.seafwg.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
  @RequestMapping("/helloworld")
  public String showHello() {
    return "hello world";
  }
}
