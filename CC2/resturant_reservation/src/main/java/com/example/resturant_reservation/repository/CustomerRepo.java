package com.example.resturant_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resturant_reservation.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
    
}
