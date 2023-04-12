package com.gpt.ordering.controller;

import com.gpt.ordering.model.Item;
import com.gpt.ordering.model.Order;
import com.gpt.ordering.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody List<Item> items) {
        // Create a new order
        Order order = new Order();
        order.setMessage("Order created successfully");
        orderRepository.save(order);

        // Return the order ID
        return ResponseEntity.ok(order);
    }
}