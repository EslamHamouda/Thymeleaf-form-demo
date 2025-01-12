package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @PostMapping("/showStudentForm")
    public String showForm(Model model) {
        model.addAttribute("student",new Student());
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute  Student student) {

        return "student-confirmation";
    }

}
