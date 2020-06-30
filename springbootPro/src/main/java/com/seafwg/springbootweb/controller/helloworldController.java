package com.seafwg.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldController {

  @RequestMapping("helloworld")
  public String showHelloWorld() {
    return "hello world";
  }
}
