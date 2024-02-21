package com.example.resturant_reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturant_reservation.model.User;
import com.example.resturant_reservation.service.UserService;


@RestController
public class UserController {
    @Autowired
    UserService uService;

    @PostMapping("/postuser")
    public User adduser(@RequestBody User user) {
 
        return uService.adduser(user);
    }
    @GetMapping("/getuser")
    public List<User> getuser() {
        return uService.getuser();
    }
    @GetMapping("/user/{email}")
    public User getuserbyid(@PathVariable String email) {
        return uService.getUserByEmail(email);

    }

}