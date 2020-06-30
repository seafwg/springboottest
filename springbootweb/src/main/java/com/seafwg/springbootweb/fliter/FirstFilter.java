package com.seafwg.springbootweb.fliter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
* @param filterName: 随便起一个名字
*        urlPatterns: 字符串的数组或者字符串[将要过滤的请求]
* */
//@WebFilter(filterName = "FirstFilter", urlPatterns = {".do",".jsp"})
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter{
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void destroy() {

  }
  /*
   * 拦截的时候走的方法：
   * */
  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    System.out.println("First Filter in...");
    /* 通过filterChain.doFilter()
     * @param: servletRequest,servletResponse 过滤请求：
     */
    filterChain.doFilter(servletRequest, servletResponse);
    System.out.println("First Filter out...");
  }
}
