package com.seafwg.springbootfreemarker.pojo;

/*
 * 创建users实体类：
 */

public class Users {
  private String userName;
  private String userSex;
  private String userAge;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }

  public String getUserAge() {
    return userAge;
  }

  public void setUserAge(String userAge) {
    this.userAge = userAge;
  }

  /*
   * 带参数的构造方法：
   */
  public Users(String userName, String userSex, String userAge) {
    this.userName = userName;
    this.userSex = userSex;
    this.userAge = userAge;
  }
  // 无参的构造方法：
  public Users() {
  }
}
