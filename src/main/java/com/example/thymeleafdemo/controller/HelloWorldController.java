package com.example.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-from";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName") String studentName, Model model){
        String name = studentName.toUpperCase();
        model.addAttribute("message", "Yo! "+name);
        return "helloworld";
    }
}
