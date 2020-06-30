package com.seafwg.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 页面请求Controller
* */
@Controller
public class PageController {

  @RequestMapping("/page")
  public String showPage() {
    // 一定要显示后缀
    return "index.html";
  }
}
