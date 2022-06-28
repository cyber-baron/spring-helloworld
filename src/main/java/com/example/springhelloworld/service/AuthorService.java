package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.AuthorsBase;

public interface AuthorService {

    AuthorsBase findById(Long authorId);

    AuthorsBase create(AuthorsBase author);
    AuthorsBase update(AuthorsBase author);
    void delete(Long authorId);
}
