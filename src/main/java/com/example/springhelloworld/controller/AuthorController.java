package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.AuthorsBase;
import com.example.springhelloworld.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/find/{authorId}")
    public ResponseEntity<AuthorsBase> findAuthorById(@PathVariable Long authorId) {
        return ResponseEntity.ok(authorService.findById(authorId));
    }

    @PostMapping("/create")
    public ResponseEntity<AuthorsBase> createAuthor(@RequestBody AuthorsBase author) {
        return ResponseEntity.ok(authorService.create(author));
    }

    @PutMapping("/update")
    public ResponseEntity<AuthorsBase> updateAuthor(@RequestBody AuthorsBase author) {
        return ResponseEntity.ok(authorService.update(author));
    }

    @DeleteMapping("/delete/{authorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAuthor(@PathVariable Long authorId) {
        authorService.delete(authorId);
    }
}
