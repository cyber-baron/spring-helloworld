package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name="AUTHORS_BASE")
public class AuthorsBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="AUTHOR_ID", nullable=false, unique=true)
    public Long authorId;

    @Column(name="AUTHOR_NAME", nullable=false)
    private String authorName;
    @Column(name="AUTHOR_SURNAME", nullable=false)
    private String authorSurname;
    @Column(name="AUTHOR_SECOND_NAME")
    private String authorSecondName;

    @Temporal(TemporalType.DATE)
    @Column(name="AUTHOR_BIRTH_DATE", nullable=false)
    private Date authorBirthDate;

    @ManyToMany
    @JoinTable
            (
                name = "BOOK_AUTHORS",
                joinColumns = @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "AUTHOR_ID"),
                inverseJoinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "BOOK_ID")
            )
    Set<Book> bookAuthors;
}
