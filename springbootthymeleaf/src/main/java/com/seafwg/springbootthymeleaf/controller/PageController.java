package com.seafwg.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
  @GetMapping("/show")
  public String ShowPage(Model model) {
    model.addAttribute("msg", "Hello thymeleaf");
    return "index";
  }
}
