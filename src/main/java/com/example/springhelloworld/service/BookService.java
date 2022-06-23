package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Book;

public interface BookService {

    Book findById(Long bookId);

}
