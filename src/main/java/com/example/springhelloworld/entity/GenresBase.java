package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="Genres Base")
public class GenresBase {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="GENRE_ID", nullable=false, unique=true)
    public int genreId;

    @Column(name="GENRE_NAME", nullable=false, unique=false)
    private String genreName;

    @ManyToMany
    @JoinTable(
            name = "Genres Base",
            joinColumns = @JoinColumn(name = "GENRE_ID"))
    Set<Book> bookGenres;
}
