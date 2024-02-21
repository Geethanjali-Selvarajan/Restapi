package com.example.resturant_reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.resturant_reservation.model.Restaurant;


@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Long>{
    Restaurant getUserByEmail(@Param("email")String email);

}