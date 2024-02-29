package com.example.resturant_reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resturant_reservation.model.User;
import com.example.resturant_reservation.repository.UserRepo;


@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
     
    public User adduser(User user)
    {
        return userRepo.save(user);
    }
    public List<User> getuser()
    {
        return userRepo.findAll();
    }
    public User getUserByEmail(String email)
    {
        User user=userRepo.getUserByEmail(email);
        return user;
    }
   public User putUser(Long userId,User u)
	{
		User uAvail=userRepo.findById(userId).orElse(null);
		if(uAvail!=null)
        {
            
            uAvail.setEmail(u.getEmail());
            uAvail.setFirstName(u.getFirstName());
            uAvail.setLastName(u.getLastName());
            uAvail.setPassword(u.getPassword());

            return userRepo.saveAndFlush(uAvail);
        }
        else
        return null;
	}
}