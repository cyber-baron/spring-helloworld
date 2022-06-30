package com.example.springhelloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="ORDER")
public class BookOrder {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ORDER_ID", nullable=false, unique=true)
    public Long orderId;

    @Column(name="ORDER_START_DATE", nullable=false)
    private String orderStartDate;
    @Column(name="ORDER_END_DATE", nullable=false)
    private String orderEndDate;

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
