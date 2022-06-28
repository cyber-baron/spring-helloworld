package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.AuthorsBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorsBase, Long> {

    AuthorsBase findByAuthorId(Long authorId);
}
