package com.example.springhelloworld.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class HelloWorldEntity {
    @Id
    private Long id;

}
