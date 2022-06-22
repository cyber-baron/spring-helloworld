package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LibraryService {
    Optional<Book> getBook();
}
