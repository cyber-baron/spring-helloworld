package com.example.springhelloworld.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Книга")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int bookId;
    private char bookName;
    private int bookPublishDate;
}
