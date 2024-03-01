package com.example.cw2.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw2.model.Student;


@RestController
public class StudentController {
    @PostMapping("/students")
    public Student getMethodName()
    {
        Student s=new Student("Divya",19);

        return s;
          
    }

}