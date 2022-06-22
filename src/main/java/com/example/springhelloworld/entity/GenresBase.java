package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="База Жанров")
public class GenresBase {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int genreId;
    private String genreName;
}
