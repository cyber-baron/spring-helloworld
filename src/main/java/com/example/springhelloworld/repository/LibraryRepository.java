package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<LibraryEntity, Long> {

    @Query(value = "SELECT * FROM HelloWorldEntity WHERE id = :id", nativeQuery = true)
    Optional<LibraryEntity> findUserById(Long id);
}
