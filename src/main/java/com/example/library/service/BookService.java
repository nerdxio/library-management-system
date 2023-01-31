package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.repository.AuthorRepository;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book insert(Book book) {
        return repository.save(book);
    }

    public List<Book> insert(List<Book> books){
        return repository.saveAll(books);
    }

    public Book update(Book book) {
        return repository.save(book);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
