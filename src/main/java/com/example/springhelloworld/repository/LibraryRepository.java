package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Book, Long> {

    @Query(value = "SELECT * FROM \"Книга\" WHERE \"ID_Книги\" = :bookId", nativeQuery = true)
    Optional<Book> findBookById(Long bookId);
}
