package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.repository.BookRepository;
import com.example.springhelloworld.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book getBook(Long bookId) {
        return null;
    }

    @Override
    public Book findById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new EntityNotFoundException("Книга с идентификатором: " + bookId + " не найдена"));
    }

    @Override
    public Book findByIdNativeQuery(Long bookId) {
        return bookRepository.findByBookIdNativeQuery(bookId);
    }

    @Override
    public Book findByIdQuery(Long bookId) {
        return bookRepository.findByBookIdQuery(bookId);
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        Book updateBook = bookRepository.findByBookId(book.getBookId());
        updateBook.setBookName(book.getBookName());
        updateBook.setBookPublishDate(book.getBookPublishDate());

        return bookRepository.save(updateBook);
    }

    @Override
    public void delete(Long bookId) {
        bookRepository.delete(bookRepository.findByBookId(bookId));
    }
}
