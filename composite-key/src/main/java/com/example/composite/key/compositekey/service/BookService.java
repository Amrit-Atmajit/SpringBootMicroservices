package com.example.composite.key.compositekey.service;

import com.example.composite.key.compositekey.model.Book;
import com.example.composite.key.compositekey.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
