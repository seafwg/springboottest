package com.seafwg.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //spring boot项目启动时会扫描@WebServlet，@WebFilter,@WebListemer注解，并将该类实例化
public class SpringbootwebApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootwebApplication.class, args);
  }

}
