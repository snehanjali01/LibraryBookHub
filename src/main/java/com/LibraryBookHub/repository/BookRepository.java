package com.LibraryBookHub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LibraryBookHub.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByAuthor(String author);
}
