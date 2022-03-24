package com.splay.modules.Student.Controllers;

import com.splay.modules.Student.Entities.Student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

  @PostMapping("")
  public Student postMethodName() {
    Student student = new Student("Gustavo", "gustavo@gmail.com", "123123");
    return student;
  }

}
