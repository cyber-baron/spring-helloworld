package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Читатель")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int userId;
    private String userName;
    private String userSurname;
    private String userSecondName;
    private int phoneNumber;
}
