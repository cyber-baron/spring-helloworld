package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="База Авторов")
public class AuthorsBase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int authorId;
    private String authorName;
    private String authorSurname;
    private String authorSecondName;
    private int authorBirthDate;
}
