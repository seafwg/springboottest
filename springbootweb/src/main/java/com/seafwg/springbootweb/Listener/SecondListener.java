package com.seafwg.springbootweb.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
* 通过方法完成注册组件：
* */

public class SecondListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("Second Listener Init....");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }
}
