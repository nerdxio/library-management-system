package com.example.library.config;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
        if (authorService.findAll() == null) {
            authorService.insert(Arrays.asList(
                    new Author("Hassan Refaat"),
                    new Author("Mohamed Salah"),
                    new Author("Alaa Atya"),
                    new Author("Abdo Ali")
            ));

            bookService.insert(Arrays.asList(
                    new Book("Spring boot starter", 300.5, authorService.findById(1L)),
                    new Book("Spring data jpa", 300.5, authorService.findById(2L)),
                    new Book("Spring 5 resbes", 300.5, authorService.findById(3L)),
                    new Book("Spring MVC ", 300.5, authorService.findById(4L))
            ));
        }

    }
}
