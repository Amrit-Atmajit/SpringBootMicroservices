package com.example.composite.key.compositekey.controller;

import com.example.composite.key.compositekey.model.Book;
import com.example.composite.key.compositekey.service.BookService;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
@Slf4j
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
}
