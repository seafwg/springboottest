package com.seafwg.springbootweb.fliter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void destroy() {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    System.out.println("Second Filter in....");
    filterChain.doFilter(servletRequest, servletResponse);
    System.out.println("Second Filter out....");
  }
}
