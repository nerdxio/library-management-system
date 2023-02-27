package com.example.library.author;


import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
public class AuthorRepositoryTest {
    final AuthorRepository repository;

//    @Test
//    void findByNameNotFoundTest(){
//        var author = repository.findByName("hasan");
//        assertEquals(false,author.isPresent());
//    }

}
