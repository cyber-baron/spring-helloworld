package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Book Order")
public class BookOrder {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ORDER_ID", nullable=false, unique=true)
    public int orderId;

    @Column(name="ORDER_START_DATE", nullable=false, unique=false)
    private String orderStartDate;
    @Column(name="ORDER_END_DATE", nullable=false, unique=false)
    private String orderEndDate;

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
