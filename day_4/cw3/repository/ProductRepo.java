package com.example.day4_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4_product.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
