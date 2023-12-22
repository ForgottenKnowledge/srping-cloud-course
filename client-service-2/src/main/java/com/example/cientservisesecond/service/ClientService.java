package com.example.cientservisesecond.service;

import com.example.cientservisesecond.model.Book;

import java.util.List;

public interface ClientService {
    public List<Book> getAllBooks();
    public  String createBooks();
    public  String deleteBooks();
}
