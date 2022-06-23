package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.repository.BookRepository;
import com.example.springhelloworld.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public Book findById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new EntityNotFoundException("Книга с идентификатором: " + bookId + " не найдена"));
    }

    public Book getById(Long bookId) {
        Book book = bookRepository.getById(bookId);
        if (Objects.isNull(book)) {
           throw new EntityNotFoundException("Книга с идентификатором: " + bookId + " не найдена");
        }
        return book;
    }
}
