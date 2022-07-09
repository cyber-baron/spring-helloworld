package com.example.springhelloworld.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GenreDTO {

    private final Long genreId;
    private final String genreName;
}
