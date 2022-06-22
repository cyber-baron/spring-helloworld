package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public Optional<Book> getBook() {
        return libraryService.getBook();
    }
}