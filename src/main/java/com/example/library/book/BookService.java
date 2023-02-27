package com.example.library.book;

import com.example.library.error.RecordNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }


    public Book findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("The Record not found " + id));
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book insert(Book book) {
        return repository.save(book);
    }

    public List<Book> insert(List<Book> books) {
        return repository.saveAll(books);
    }

    public Book update(Book book) {
        return repository.save(book);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
