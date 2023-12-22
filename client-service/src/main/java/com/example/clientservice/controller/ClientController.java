package com.example.clientservice.controller;

import com.example.clientservice.model.Book;
import com.example.clientservice.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return clientService.getAllBooks();
    }

    @PostMapping("/books")
    public String createBooks() {
        return clientService.createBooks();
    }

    @DeleteMapping("/books")
    public String deleteBooks(){
        return clientService.deleteBooks();
    }

    @GetMapping("/test")
    public String balancerTest() {
        return "Отработал тестовый метод сервиса 1";
    }
}

