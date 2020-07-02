package com.seafwg.springbootthymeleaf.controller;

import com.seafwg.springbootthymeleaf.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class PageController {
  @GetMapping("/show")
  public String ShowPage(Model model, HttpServletRequest request) {
    model.addAttribute("msg", "Hello thymeleaf");
    model.addAttribute("date", new Date());
    model.addAttribute("sex", '男');
    List<Users> list = new ArrayList<>();
    list.add(new Users("1111","assassin",22));
    list.add(new Users("2222","seafwg",23));
    list.add(new Users("3333","intelwisd",26));
    list.add(new Users("4444","smallseafwg",2));
    list.add(new Users("5555","smallintel",2));
    model.addAttribute("list", list);

    Map<String, Users> map = new HashMap<>();
    map.put("user1",new Users("1111","assassin",22));
    map.put("user2",new Users("3333","intelwisd",26));
    map.put("user3",new Users("4444","smallseafwg",2));
    map.put("user4",new Users("2222","seafwg",23));
    map.put("user5",new Users("5555","smallintel",2));
    model.addAttribute("map",map);
    request.setAttribute("req","HttpServletRequest");
    request.getSession().setAttribute("session","HttpSession");
    request.getSession().getServletContext().setAttribute("app","application");
    return "index";
  }

  //添加showcontroller,测试普通URL跳转传参
  @GetMapping("/show1")
  public String Show1(String id, String name) {
    System.out.println(id+"\t"+name);
    return "index1";
  }

  //添加showcontroller,测试普通URL跳转传参
  @GetMapping("/show2/{id}/{name}")
  public String Show2(@PathVariable String id, @PathVariable String name) {
    System.out.println(id+"\t"+name);
    return "index1";
  }
}
