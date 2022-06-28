package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.GenresBase;

public interface GenreService {

    GenresBase findById(Long genreId);

    GenresBase create(GenresBase genre);
    GenresBase update(GenresBase genre);
    void delete(Long genreId);
}
