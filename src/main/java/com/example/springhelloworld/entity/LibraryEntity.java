package com.example.springhelloworld.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class LibraryEntity {
    @Id
    private Long id;
}
