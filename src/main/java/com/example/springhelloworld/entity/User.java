package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="USER_ID", nullable=false, unique=true)
    public Long userId;

    @Column(name="USER_NAME", nullable=false)
    private String userName;
    @Column(name="USER_SURNAME", nullable=false)
    private String userSurname;
    @Column(name="USER_SECOND_NAME")
    private String userSecondName;
    @Column(name="USER_PHONE_NUMBER", nullable=false)
    private int userPhoneNumber;

    @OneToMany (targetEntity = BookOrder.class, cascade = CascadeType.ALL, mappedBy = "user")
    private List<BookOrder> bookOrdersList;
}
