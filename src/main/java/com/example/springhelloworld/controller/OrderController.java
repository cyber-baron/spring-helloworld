package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.BookOrder;
import com.example.springhelloworld.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/find/{orderId}")
    public ResponseEntity<BookOrder> findOrderById(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderService.findById(orderId));
    }

    @PostMapping("/create")
    public ResponseEntity<BookOrder> createOrder(@RequestBody BookOrder order) {
        return ResponseEntity.ok(orderService.create(order));
    }

    @PutMapping("/update")
    public ResponseEntity<BookOrder> updateOrder(@RequestBody BookOrder order) {
        return ResponseEntity.ok(orderService.update(order));
    }

    @DeleteMapping("/delete/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOrder(@PathVariable Long orderId) {
        orderService.delete(orderId);
    }
}
