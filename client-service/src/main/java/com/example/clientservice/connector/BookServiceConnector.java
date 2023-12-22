package com.example.clientservice.connector;

import com.example.clientservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FeignClient(name = "BOOK-SERVICE", fallbackFactory = BookServiceConnector.BookServiceConnectorFallbackFactory.class)
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();

    @PostMapping("/api/books")
    String createBooks();

    @DeleteMapping("/api/books")
    String deleteBooks();

    @Component
    class BookServiceConnectorFallbackFactory implements FallbackFactory<FallbackWithFactory> {

        @Override
        public FallbackWithFactory create(Throwable cause) {
            return new FallbackWithFactory(cause.getMessage());
        }
    }

    @Slf4j
    record FallbackWithFactory(String reason) implements BookServiceConnector {
        @Override
        public List<Book> getAllBooks() {
            return new ArrayList<Book>();
        }

        @Override
        public String createBooks() {
            return "Отработал Fallback";
        }

        @Override
        public String deleteBooks() {
            return "Отработал Fallback";
        }
    }
}
