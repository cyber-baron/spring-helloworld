package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.GenresBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenresBase, Long> {

    GenresBase findByGenreId(Long genreId);
}
