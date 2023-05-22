package com.example.demo_spring.controllers;

import com.example.demo_spring.DemoSpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Hello {
    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    @GetMapping("/hi")
    public String hi () {
        return "hi";
    }

}

