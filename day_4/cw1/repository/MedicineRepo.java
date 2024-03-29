package com.example.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long> {
    
}
