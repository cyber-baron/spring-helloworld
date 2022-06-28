package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name="Author Base")
public class AuthorsBase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="AUTHOR_ID", nullable=false, unique=true)
    public int authorId;

    @Column(name="AUTHOR_NAME", nullable=false, unique=false)
    private String authorName;
    @Column(name="AUTHOR_SURNAME", nullable=false, unique=false)
    private String authorSurname;
    @Column(name="AUTHOR_SECOND_NAME", nullable=true, unique=false)
    private String authorSecondName;

    @Temporal(TemporalType.DATE)
    @Column(name="AUTHOR_BIRTH_DATE", nullable=false, unique=false)
    private Date authorBirthDate;

    @ManyToMany
    @JoinTable(
            name = "Author Base",
            joinColumns = @JoinColumn(name = "AUTHOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHOR_ID"))
    Set<Book> bookAuthors;
}
