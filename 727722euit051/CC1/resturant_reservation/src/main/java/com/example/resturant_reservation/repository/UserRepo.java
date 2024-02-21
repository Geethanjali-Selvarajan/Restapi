package com.example.resturant_reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.resturant_reservation.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    User  findByEmail(String email);

    User getUserByEmail(@Param("email")String email);
}