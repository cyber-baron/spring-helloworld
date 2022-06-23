package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface LibraryService {

    Book getBook(Long bookId);

}
