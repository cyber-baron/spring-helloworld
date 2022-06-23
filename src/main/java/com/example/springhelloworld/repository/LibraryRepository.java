package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Book, Long> {

    @Query(value = "SELECT * FROM Book as b WHERE b.bookId = :bookId", nativeQuery = true)
    Optional<Book> findBookById(@Param("bookId") Long bookId);
}
