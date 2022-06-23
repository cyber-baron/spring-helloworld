package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.repository.LibraryRepository;
import com.example.springhelloworld.service.LibraryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    @Override
    public Book getBook(Long bookId) {
        return libraryRepository.findBookById(bookId);
    }
}
