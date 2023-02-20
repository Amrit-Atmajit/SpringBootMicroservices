package com.example.composite.key.compositekey.repository;

import com.example.composite.key.compositekey.model.Book;
import com.example.composite.key.compositekey.model.BookVersionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, BookVersionId> {
}
