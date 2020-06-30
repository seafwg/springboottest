package com.seafwg.springbootweb.config;

import com.seafwg.springbootweb.fliter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
  @Bean
  public FilterRegistrationBean getFilterRegistrationBean() {
    FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//    bean.addUrlPatterns(new String[] {"*.do","*.jsp"});
    bean.addUrlPatterns("/second");
    return bean;
  }
}
