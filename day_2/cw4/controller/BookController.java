package com.example.cw4.controller;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw4.model.Book;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBookDetails()
    {
        Date dt=new Date();
        //fetching current date
        Book b=new Book("The Great Soldier","G. Gyan",dt);
        return b;
    }
}
