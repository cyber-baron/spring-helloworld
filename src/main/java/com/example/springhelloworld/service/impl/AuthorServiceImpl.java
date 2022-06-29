package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.AuthorsBase;
import com.example.springhelloworld.repository.AuthorRepository;
import com.example.springhelloworld.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorsBase findById(Long authorId) {
        return authorRepository.findById(authorId).orElseThrow(() -> new EntityNotFoundException("Автор с идентификатором: " + authorId + " не найден"));
    }

    @Override
    public AuthorsBase create(AuthorsBase author) {
        return authorRepository.save(author);
    }

    @Override
    public AuthorsBase update(AuthorsBase author) {
        AuthorsBase updateAuthor = authorRepository.findByAuthorId(author.getAuthorId());
        updateAuthor.setAuthorName(author.getAuthorName());
        updateAuthor.setAuthorSurname(author.getAuthorSurname());
        updateAuthor.setAuthorSecondName(author.getAuthorSecondName());
        updateAuthor.setAuthorBirthDate(author.getAuthorBirthDate());

        return authorRepository.save(updateAuthor);
    }

    @Override
    public void delete(Long authorId) {

    }
}
