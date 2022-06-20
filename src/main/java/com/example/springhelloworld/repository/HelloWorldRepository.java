package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.HelloWorldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, Long> {

    @Query(value = "SELECT * FROM HelloWorldEntity WHERE id = :id", nativeQuery = true)
    Optional<HelloWorldEntity> findUserById(Long id);
}
