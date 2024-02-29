package com.example.resturant_reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="Customer")
@Transactional
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String customerEmail;
    String customerMobile;
    
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
 
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerMobile() {
        return customerMobile;
    }
    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }
    
}
