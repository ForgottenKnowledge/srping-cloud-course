package com.example.cientservisesecond.connector;

import com.example.cientservisesecond.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "BOOK-SERVICE")
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();

    @PostMapping("/api/books")
    String createBooks();

    @DeleteMapping("/api/books")
    String deleteBooks();
}

