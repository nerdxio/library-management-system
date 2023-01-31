package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public List<Author> findAll(){
        return repository.findAll();
    }
    public Author insert(Author author){
        return repository.save(author);
    }
    public List<Author> insert(List<Author> author){
        return repository.saveAll(author);
    }
    public Author update(Author author){
        return repository.save(author);
    }
    public void deleteById(Long id){
         repository.deleteById(id);
    }
}
