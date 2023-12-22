package com.example.bookservice.service;


import com.example.bookservice.DAO.BookRepository;
import com.example.bookservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public String createBooks() {
        // Создаем список книг для сохранения в БД
        List<Book> books = Arrays.asList(
                Book.builder().id(1L).title("Book 1").description("Description 1").imageLink("Link 1").build(),
                Book.builder().id(2L).title("Book 2").description("Description 2").imageLink("Link 2").build(),
                Book.builder().id(3L).title("Book 3").description("Description 3").imageLink("Link 3").build()
        );
        // Сохраняем книги в БД
        bookRepository.insert(books);
        return "Выполнение метода createBooks() прошло успешно";
    }

    public String deleteBooks(){
        // Создаем список книг для удаления из БД
        List<Book> books = Arrays.asList(
                Book.builder().id(1L).title("Book 1").description("Description 1").imageLink("Link 1").build(),
                Book.builder().id(2L).title("Book 2").description("Description 2").imageLink("Link 2").build(),
                Book.builder().id(3L).title("Book 3").description("Description 3").imageLink("Link 3").build()
        );
        // Удаляем книги из БД
        bookRepository.deleteAll(books);
        return "Выполнение метода deleteBooks() прошло успешно";

    }
}