package com.example.ce5.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce5.model.Student;
  
    
    @RestController
    public class StudentController {
        @GetMapping("/student")
        public ArrayList<Student>getMessage()
        {
            ArrayList<Student> details=new ArrayList<>();
                Student s1=new Student("John","Welcome, John!");
            details.add(s1);
            return details;
            
        }
    } 

