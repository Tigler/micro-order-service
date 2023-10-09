package com.micro.order.controller;

import com.micro.order.entity.Order;
import com.micro.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("")
    public ResponseEntity<Collection<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders());
    }

    @PutMapping
    public ResponseEntity<Order> createOrder(@RequestBody  Order order) {
        return ResponseEntity.ok(orderService.create(order));
    }
}
