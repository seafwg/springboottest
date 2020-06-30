package com.seafwg.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
//  RESTF 风格：
  @GetMapping("/{page}")
  // @PathVariable RestFul风格去除URL参数
  public String showPage(@PathVariable String page) {
    return page;
  }
}
