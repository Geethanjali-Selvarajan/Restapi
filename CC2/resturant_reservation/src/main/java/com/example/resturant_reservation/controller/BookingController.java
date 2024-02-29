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

import com.example.resturant_reservation.model.Booking;
import com.example.resturant_reservation.service.BookingService;

@RestController
public class BookingController {
    @Autowired
    BookingService rService;

    @PostMapping("/bookpost")
    public Booking addinfo(@RequestBody Booking r) {

        return rService.adduser(r);
    }

    @GetMapping("/bookget")
    public List<Booking> getinfo() {
        return rService.getuser();
    }

    @GetMapping("/book/{email}")
    public Booking getuserbyid(@PathVariable String email) {
        return rService.getUserByEmail(email);

    }

    @PutMapping("bookput/{RestaurantId}")
    public Booking putinfoRestaurant(@PathVariable Long RestaurantId, @RequestBody Booking r) {

        return rService.putinfo(RestaurantId, r);
    }

    @DeleteMapping("/bookdelete/{RestaurantId}")
    public String deleteinfoRestuarant(@PathVariable Long RestaurantId)
    {
        return rService.deleteinfo(RestaurantId);
    }
    @GetMapping("/book/SortBy/{field}")
    public List<Booking> getRestaurantWithSorting(@PathVariable String field)
    {
        return rService.getRestaurantWithSorting(field);
    } 
}