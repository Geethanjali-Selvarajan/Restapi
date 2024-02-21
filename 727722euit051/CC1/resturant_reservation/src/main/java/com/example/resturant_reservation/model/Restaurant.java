package com.example.resturant_reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Restaurant")
public class Restaurant {
    @Id
     Long restaurantId;
    String firstName;
    String lastName;
    String email;
    Long phone;
    String RestaurantName;
    String seatingPreference;
    int numberOfSeats;
    String reservationDate;
    String reservationTime;
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
        return RestaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
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
    
}
