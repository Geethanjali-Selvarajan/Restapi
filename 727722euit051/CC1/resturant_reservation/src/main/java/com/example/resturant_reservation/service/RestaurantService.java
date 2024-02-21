package com.example.resturant_reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resturant_reservation.model.Restaurant;
import com.example.resturant_reservation.repository.RestaurantRepo;


@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo rRepo;

    public Restaurant adduser(Restaurant r)
    {
        return rRepo.save(r);
    }
    public List<Restaurant> getuser()
    {
        return rRepo.findAll();
    }
    public Restaurant getUserByEmail(String email)
    {
        Restaurant res=rRepo.getUserByEmail(email);
        return res;
    }
    public Restaurant putinfo(Long RestaurantId,Restaurant r)
	{
		Restaurant resAvail=rRepo.findById(RestaurantId).orElse(null);
		if(resAvail!=null)
        {
            resAvail.setFirstName(r.getFirstName());
            resAvail.setLastName(r.getLastName());
            resAvail.setEmail(r.getEmail());
            resAvail.setPhone(r.getPhone());
            resAvail.setRestaurantName(r.getRestaurantName());
            resAvail.setSeatingPreference(r.getSeatingPreference());
            resAvail.setNumberOfSeats(r.getNumberOfSeats());
            resAvail.setReservationDate(r.getReservationDate());
            resAvail.setReservationTime(r.getReservationTime());

            return rRepo.saveAndFlush(resAvail);
        }
        else
        return null;
	}

    public String deleteinfo(Long RestaurantId)
    {
        rRepo.deleteById(RestaurantId);
        return("infodeleted");
    }
   
}