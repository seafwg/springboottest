package com.seafwg.springbootweb.config;

import com.seafwg.springbootweb.Listener.SecondListener;
import com.seafwg.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;

@Configuration
public class ListenerConfig {
  @Bean
  public ServletListenerRegistrationBean ServletListenerRegistrationBean() {
    ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
    // 不需要配置url
    return bean;
  }
}
