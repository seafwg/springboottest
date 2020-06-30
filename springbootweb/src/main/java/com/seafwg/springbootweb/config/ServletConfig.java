package com.seafwg.springbootweb.config;

import com.seafwg.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
  /*
  * 完成Servlet组件的注册
  * */
  public ServletRegistrationBean getServletRegistrationBean() {
    ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
    bean.addUrlMappings("/second");
    return bean;
  }
}
