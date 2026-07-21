package org.fmi.techstore.service;

import org.fmi.techstore.entity.Order;
import org.fmi.techstore.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id: " + id));
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Order> findByUsername(String username) {
        return repository.findByUserUsername(username);
    }

}