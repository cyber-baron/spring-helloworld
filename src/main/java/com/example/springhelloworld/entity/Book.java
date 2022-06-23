package com.example.springhelloworld.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="BOOK_ID", nullable=false, unique=true)
    public Long bookId;

    @Column(name="BOOK_NAME", nullable=false, unique=false)
    private char bookName;
    @Column(name="BOOK_PUBLISH_DATE", nullable=false, unique=false)
    private int bookPublishDate;

    @ManyToMany(mappedBy = "bookAuthors")
    Set<AuthorsBase> author;

    @ManyToMany(mappedBy = "bookGenres")
    Set<GenresBase> genre;

    @OneToMany (targetEntity = BookOrder.class, cascade = CascadeType.ALL, mappedBy = "book")
    private List<BookOrder> bookOrdersList;
}
