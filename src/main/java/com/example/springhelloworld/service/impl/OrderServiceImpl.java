package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.BookOrder;
import com.example.springhelloworld.repository.OrderRepository;
import com.example.springhelloworld.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public BookOrder findById(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new EntityNotFoundException("Заказ с идентификатором: " + orderId + " не найден"));
    }

    @Override
    public BookOrder create(BookOrder order) {
        return orderRepository.save(order);
    }

    @Override
    public BookOrder update(BookOrder order) {
        BookOrder updateOrder = orderRepository.findByOrderId(order.getOrderId());
        updateOrder.setOrderStartDate(order.getOrderStartDate());
        updateOrder.setOrderEndDate(order.getOrderEndDate());

        return orderRepository.save(updateOrder);
    }

    @Override
    public void delete(Long orderId) {
        orderRepository.delete(orderRepository.findByOrderId(orderId));
    }
}
