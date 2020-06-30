package com.sefwg.constroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Constroller+@responseBody 直接返回json字符串，不做页面跳转
public class helloWorldController {
  @RequestMapping("/helloworld")
  public String showHelloWorld() {
    return "Hello World";
  }
}
