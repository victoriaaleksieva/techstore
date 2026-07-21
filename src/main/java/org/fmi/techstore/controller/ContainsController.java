package org.fmi.techstore.controller;

import org.fmi.techstore.entity.Contains;
import org.fmi.techstore.entity.ContainsId;
import org.fmi.techstore.service.ContainsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contains")
public class ContainsController {

    private final ContainsService service;

    public ContainsController(ContainsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contains> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Contains create(@RequestBody Contains contains) {
        return service.save(contains);
    }

    @DeleteMapping("/{orderId}/{productId}")
    public void delete(
            @PathVariable Integer orderId,
            @PathVariable Integer productId) {

        service.delete(
                new ContainsId(orderId, productId));
    }
}