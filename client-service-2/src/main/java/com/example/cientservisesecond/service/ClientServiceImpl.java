package com.example.cientservisesecond.service;

import com.example.cientservisesecond.connector.BookServiceConnector;
import com.example.cientservisesecond.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final BookServiceConnector bookServiceConnector;

    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooks();
    }

    @Override
    public String createBooks() {
        return bookServiceConnector.createBooks();
    }

    @Override
    public String deleteBooks() {
        return bookServiceConnector.deleteBooks();
    }
}
