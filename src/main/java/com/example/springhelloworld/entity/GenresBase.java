package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="GENRES_BASE", schema="public")
public class GenresBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="GENRE_ID", nullable=false, unique=true)
    public int genreId;

    @Column(name="GENRE_NAME", nullable=false, unique=false)
    private String genreName;

    @ManyToMany
    @JoinTable
            (
            name = "BOOK_GENRES",
            joinColumns = @JoinColumn(name = "GENRE_ID", referencedColumnName = "GENRE_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "BOOK_ID")
            )
    Set<Book> bookGenres;
}
