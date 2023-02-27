package com.example.library.config;

import com.example.library.author.AuthorService;
import com.example.library.book.BookService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements CommandLineRunner {

    private final BookService bookService;

    private final AuthorService authorService;

    public DataLoader(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
