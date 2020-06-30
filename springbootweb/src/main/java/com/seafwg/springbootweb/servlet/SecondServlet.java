package com.seafwg.springbootweb.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 方式二：整合servlet
* */

@WebServlet(name = "SecondServlet", urlPatterns = "/second")
public class SecondServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("second Servlet ......");
  }
}
