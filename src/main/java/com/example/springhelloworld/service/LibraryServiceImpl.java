package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.repository.LibraryRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;
    private Long ids = 3L;

    public LibraryServiceImpl(LibraryRepository algorithmRepository) {
        this.libraryRepository = algorithmRepository;
    }

    @Override
    public Optional<Book> getBook() {
        return libraryRepository.findBookById(ids);
    }
}
