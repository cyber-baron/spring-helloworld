package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Library, Long> {

    @Query(value = "SELECT * FROM \"Книга\" WHERE \"ID_Книги\" = :id", nativeQuery = true)
    Optional<Library> findBookById(Long id);
}
