package com.example.bookservice.controller;


import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> getALl() {
        return bookService.findAll();
    }

    @PostMapping()
    public String createBooks() {
        return bookService.createBooks();
    }

    @DeleteMapping()
    public String deleteBooks() {
        return bookService.deleteBooks();
    }
}