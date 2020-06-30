package com.seafwg.springbootweb.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
* 共有8个监听器：
* ServletContentListener监听sevlet的上下文
* */

@WebListener
public class FirstListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("First Listener Init....");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }
}
