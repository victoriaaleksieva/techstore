package org.fmi.techstore.controller;

import org.fmi.techstore.entity.Item;
import org.fmi.techstore.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<Item> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Item update(@PathVariable Integer id,
                       @RequestBody Item item) {
        item.setProductNum(id);
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}