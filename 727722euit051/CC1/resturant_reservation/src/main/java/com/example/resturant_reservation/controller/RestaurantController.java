package com.example.resturant_reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturant_reservation.model.Restaurant;
import com.example.resturant_reservation.service.RestaurantService;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService rService;

    @PostMapping("/respost")
    public Restaurant addinfo(@RequestBody Restaurant r) {

        return rService.adduser(r);
    }

    @GetMapping("/resget")
    public List<Restaurant> getinfo() {
        return rService.getuser();
    }

    @GetMapping("/res/{email}")
    public Restaurant getuserbyid(@PathVariable String email) {
        return rService.getUserByEmail(email);

    }

    @PutMapping("resput/{RestaurantId}")
    public Restaurant putinfoRestaurant(@PathVariable Long RestaurantId, @RequestBody Restaurant r) {

        return rService.putinfo(RestaurantId, r);
    }

    @DeleteMapping("/resdelete/{RestaurantId}")
    public String deleteinfoRestuarant(@PathVariable Long RestaurantId)
    {
        return rService.deleteinfo(RestaurantId);
    }
}