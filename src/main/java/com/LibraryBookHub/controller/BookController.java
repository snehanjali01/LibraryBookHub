package com.LibraryBookHub.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryBookHub.model.Book;
import com.LibraryBookHub.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService service;
    
    @PostMapping   
    public Book add(@RequestBody Book book){
    	return service.save(book); 
    	}
    
    @PutMapping("/{id}")
    public Book update(@PathVariable String id, @RequestBody Book book){
              book.setId(id);
              return service.save(book);
              }
    

    @GetMapping  
    public List<Book> getAll(){
    	return service.getAll(); 
    	}
    
    @GetMapping("/{id}") 
    public Optional<Book> getById(@PathVariable String id) {
    	return service.getById(id); 
    	}
    
    @GetMapping("/author/{author}")
    public List<Book> byAuthor(@PathVariable String author) {
        return service.getByAuthor(author); 
        }
    
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
    	service.delete(id); 
    	}
}