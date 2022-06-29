package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.GenresBase;
import com.example.springhelloworld.repository.GenreRepository;
import com.example.springhelloworld.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public GenresBase findById(Long genreId) {
        return genreRepository.findById(genreId).orElseThrow(() -> new EntityNotFoundException("Жанр с идентификатором: " + genreId + " не найден"));
    }

    @Override
    public GenresBase create(GenresBase genre) {
        return genreRepository.save(genre);
    }

    @Override
    public GenresBase update(GenresBase genre) {
        GenresBase updateGenre = genreRepository.findByGenreId(genre.getGenreId());
        updateGenre.setGenreName(genre.getGenreName());

        return genreRepository.save(updateGenre);
    }

    @Override
    public void delete(Long genreId) {
        genreRepository.delete(genreRepository.findByGenreId(genreId));
    }
}
