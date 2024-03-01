package com.example.day4_product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4_product.model.Product;
import com.example.day4_product.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService pservice;

    @PostMapping("/productpost")
    public Product addproduct(@RequestBody Product p) {

        return pservice.addProduct(p);
    }

    @GetMapping("productget")
    public List<Product> findproduct() {
        return pservice.getProduct();
    }

    @GetMapping("/product/{productId}")
    public Optional<Product> getproductById(@PathVariable int productId) {
        return pservice.getproductById(productId);
    }
    @PutMapping("/editProduct/{productId}")
    public Product editProduct(@PathVariable int productId,@RequestBody Product p)
    {
        return pservice.editProduct(productId,p);
    }
    @DeleteMapping("q{productId}")
    public String deleteProduct(@PathVariable int productId)
    {
        return pservice.deleteProduct(productId);
    }
}
