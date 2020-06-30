package com.seafwg.springbootfreemarker.controller;

import com.seafwg.springbootfreemarker.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {
  /*
  * 处理请求并返回数据的请求：
  * */
  @GetMapping("/showUsers")
  // mvc 的Model
  public String showUsers(Model model) {
    List<Users> list = new ArrayList<>();
    list.add(new Users("seafwg", "F", "22"));
    list.add(new Users("Assassin","M","30"));
    list.add(new Users("wunworld","F","22"));
    model.addAttribute("list", list);//list:返回的key,key值为当前list

    // 跳转到试图去：
    return "usersList"; // 不添加后缀名
  }
}
