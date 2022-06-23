package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.service.BookService;
import com.example.springhelloworld.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/library")
public class LibraryController {

    private final LibraryService libraryService;

    private final BookService bookService;

    @GetMapping("/get/{bookId}")
    public Optional<Book> getBook(@PathVariable Long bookId) {
        return libraryService.getBook();
    }

    @GetMapping("/find/{bookId}")
    public Optional<Book> findBookById(@PathVariable Long bookId) {
        return libraryService.getBook();
    }
}