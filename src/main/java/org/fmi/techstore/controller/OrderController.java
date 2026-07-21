package org.fmi.techstore.controller;

import org.fmi.techstore.entity.Order;
import org.fmi.techstore.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> getAll() {
        return service.findAll();
    }

    @GetMapping("/user/{username}")
    public List<Order> getOrdersByUsername(
            @PathVariable String username) {

        return service.findByUsername(username);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.save(order);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable Integer id,
                        @RequestBody Order order) {
        order.setOrderNum(id);
        return service.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}