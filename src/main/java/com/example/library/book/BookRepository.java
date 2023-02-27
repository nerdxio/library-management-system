package com.example.library.book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    @Override
    @EntityGraph(attributePaths = {"author"})
    Optional<Book> findById(Long aLong);
}
