package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AuthorsBase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int authorId;
    private String authorName;
    private String authorSurname;
    private String authorSecondName;
    private int authorBirthDate;
}
