package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.service.BookService;
import com.example.springhelloworld.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final LibraryService libraryService;
    private final BookService bookService;

    //First version
    @GetMapping("/get/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable Long bookId) {
        return ResponseEntity.ok(libraryService.getBook(bookId));
    }

    //Hiber
    @GetMapping("/find/{bookId}")
    public ResponseEntity<Book> findBookById(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookService.findById(bookId));
    }

    //NativeQuery
    @GetMapping("/find/{bookId}")
    public ResponseEntity<Book> findBookByIdNativeQuery(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookService.findByIdNativeQuery(bookId));
    }

    //JPQL
    @GetMapping("/find/{bookId}")
    public ResponseEntity<Book> findBookByIdQuery(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookService.findByIdQuery(bookId));
    }


    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.create(book));
    }


    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.update(book));
    }

    @DeleteMapping("/delete/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBook(@PathVariable Long bookId) {
        bookService.delete(bookId);
    }
}
