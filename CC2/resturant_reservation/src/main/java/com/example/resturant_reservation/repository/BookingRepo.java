package com.example.resturant_reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resturant_reservation.model.Booking;



@Repository
public interface BookingRepo extends JpaRepository<Booking,Long>{
     
    Booking getUserByEmail(String email);

}