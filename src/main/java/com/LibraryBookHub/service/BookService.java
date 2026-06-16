package com.LibraryBookHub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.LibraryBookHub.model.Book;
import com.LibraryBookHub.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repo;

    public List<Book> getAll(){
    	return repo.findAll();
    	}
    public Optional<Book> getById(String id){ 
    	return repo.findById(id); 
    	}
    public Book save(Book book){
    	return repo.save(book); 
    	}
    public void delete(String id){
    	repo.deleteById(id); 
    	}
    public List<Book> getByAuthor(String a){
    	return repo.findByAuthor(a); 
    	}
}