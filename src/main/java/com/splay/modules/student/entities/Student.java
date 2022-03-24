package com.splay.modules.Student.Entities;

import java.util.Date;

public class Student {

  public Student(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  private String name;
  private String avatarUrl;
  private Date birthDate;
  private String email;
  private String password;

  public String getName() {
    return name;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

}
