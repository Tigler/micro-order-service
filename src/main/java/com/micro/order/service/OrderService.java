package com.micro.order.service;

import com.micro.order.entity.Order;
import com.micro.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Collection<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }
}
