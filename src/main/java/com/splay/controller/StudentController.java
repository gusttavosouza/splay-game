package com.splay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class StudentController {

    @GetMapping
    public String home(){
        return "Olá mundo";
    }
}
