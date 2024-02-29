package com.example.resturant_reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.resturant_reservation.model.Booking;
import com.example.resturant_reservation.repository.BookingRepo;


@Service
public class BookingService {
    @Autowired
    BookingRepo rRepo;

    public Booking adduser(Booking r)
    {
        return rRepo.save(r);
    }
    public List<Booking> getuser()
    {
        return rRepo.findAll();
    }
    public Booking getUserByEmail(String email)
    {
        Booking res=rRepo.getUserByEmail(email);
        return res;
    }
    public Booking putinfo(Long RestaurantId,Booking r)
	{
		Booking resAvail=rRepo.findById(RestaurantId).orElse(null);
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
        return("deleted");
    }
    public List<Booking> getRestaurantWithSorting(String field)
    {
        Sort sort=Sort.by(Sort.Direction.ASC,field);
        return rRepo.findAll(sort);
    }
   
}