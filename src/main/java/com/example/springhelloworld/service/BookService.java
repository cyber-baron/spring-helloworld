package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Book;

public interface BookService {

    Book getBook(Long bookId);

    Book findById(Long bookId);

    Book findByIdNativeQuery(Long bookId);

    Book findByIdQuery(Long bookId);

    Book create(Book book);
    Book update(Book book);
    void delete(Long bookId);
}
