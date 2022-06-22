package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class BookTrack {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int trackId;
    private String trackStartDate;
    private String trackEndDate;
}
