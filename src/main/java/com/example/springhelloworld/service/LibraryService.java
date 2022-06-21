package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.Library;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LibraryService {
    Optional<Library> getLibrary();
}
