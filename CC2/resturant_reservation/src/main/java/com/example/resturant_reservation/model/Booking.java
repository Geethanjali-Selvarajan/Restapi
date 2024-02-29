package com.example.resturant_reservation.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name ="Booking")
@Transactional
public class Booking {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Long restaurantId;
    String restaurantName;
    String firstName;
    String lastName;
    String email;
    Long phone;
    String seatingPreference;
    int numberOfSeats;
    String reservationDate;
    String reservationTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")

    Customer customer;

    public Long getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public String getSeatingPreference() {
        return seatingPreference;
    }
    public void setSeatingPreference(String seatingPreference) {
        this.seatingPreference = seatingPreference;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
    public String getReservationTime() {
        return reservationTime;
    }
    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
    
}
