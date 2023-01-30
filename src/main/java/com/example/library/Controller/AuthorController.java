package com.example.library.Controller;

import com.example.library.model.Author;
import com.example.library.service.AuthorService;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Author>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<Author> insert(@RequestBody @NotNull Author author) {
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(author.getId()).toUri();
        return ResponseEntity.created(location).body(service.insert(author));
    }

    @PutMapping
    public ResponseEntity<Author> update(@RequestBody Author author) {
        service.update(author);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
