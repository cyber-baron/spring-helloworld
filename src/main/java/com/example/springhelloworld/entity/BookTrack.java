package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Выдача Книг")
public class BookTrack {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int trackId;
    private String trackStartDate;
    private String trackEndDate;
}
