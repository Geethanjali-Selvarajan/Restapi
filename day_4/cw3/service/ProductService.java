package com.example.day4_product.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4_product.model.Product;
import com.example.day4_product.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo pRepo;

    public Product addProduct(Product p)
    {
        return pRepo.save(p);
    }
    public List<Product> getProduct()
    {
       return pRepo.findAll();
    }
    public Optional<Product> getproductById(int id)
    {
        return pRepo.findById(id);
    }
    public Product editProduct(int productId,Product p)
    {
        Product productAvail=pRepo.findById(productId).orElse(null);
        if(productAvail!=null)
        {
            productAvail.setProductName(p.getProductName());
            productAvail.setPrice(p.getPrice());
            productAvail.setDescription(p.getDescription());
            productAvail.setQuantity(p.getQuantity());
            return pRepo.saveAndFlush(productAvail);
        }
        else{
            return null;
        }

    }
    public String deleteProduct(int productId)
    {
        pRepo.deleteById(productId);
        return("productDeleted");
    }
}
