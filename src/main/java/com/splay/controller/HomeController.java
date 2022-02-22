package com.splay.controller;

import com.splay.domain.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home(){
        return "Olá mundo";
    }
}
