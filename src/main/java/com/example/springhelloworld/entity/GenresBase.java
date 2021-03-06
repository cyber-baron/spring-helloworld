package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="GENRE")
public class GenresBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="GENRE_ID", nullable=false, unique=true)
    public Long genreId;

    @Column(name="GENRE_NAME", nullable=false)
    private String genreName;

    @ManyToMany
    @JoinTable
            (
                name = "BOOK_GENRE",
                joinColumns = @JoinColumn(name = "GENRE_ID", referencedColumnName = "GENRE_ID"),
                inverseJoinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "BOOK_ID")
            )
    Set<Book> bookGenres;
}
