package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<BookOrder, Long> {

    BookOrder findByOrderId(Long orderId);
}
