package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.BookOrder;

public interface OrderService {

    BookOrder findById(Long orderId);

    BookOrder create(BookOrder order);
    BookOrder update(BookOrder order);
    void delete(Long orderId);
}
