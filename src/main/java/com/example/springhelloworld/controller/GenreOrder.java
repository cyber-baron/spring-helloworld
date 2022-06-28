package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.GenresBase;
import com.example.springhelloworld.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/genres")
public class GenreOrder {

    private final GenreService genreService;

    @GetMapping("/find/{genreId}")
    public ResponseEntity<GenresBase> findGenreById(@PathVariable Long genreId) {
        return ResponseEntity.ok(genreService.findById(genreId));
    }

    @PostMapping("/create")
    public ResponseEntity<GenresBase> createGenre(@RequestBody GenresBase genre) {
        return ResponseEntity.ok(genreService.create(genre));
    }

    @PutMapping("/update")
    public ResponseEntity<GenresBase> updateGenre(@RequestBody GenresBase genre) {
        return ResponseEntity.ok(genreService.update(genre));
    }

    @DeleteMapping("/delete/{genreId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGenre(@PathVariable Long genreId) {
        genreService.delete(genreId);
    }
}
