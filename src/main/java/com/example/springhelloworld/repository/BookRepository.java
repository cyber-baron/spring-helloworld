package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {


//    Book findByBookId(Long bookId);
//
//    @Query(value = "SELECT * FROM Book as b WHERE b.bookId = :bookId", nativeQuery = true)
//    Optional<Book> findByBookIdNativeQuery(@Param("bookId") Long bookId);
//
//    @Query(value = "select b from  Book as b where b.bookId = :bookId")
//    Optional<Book> findByBookIdQuery(@Param("bookId") Long bookId);
}
