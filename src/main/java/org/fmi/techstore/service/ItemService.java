package org.fmi.techstore.service;

import org.fmi.techstore.entity.Item;
import org.fmi.techstore.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

    public Item findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Item not found with id: " + id));
    }

    public Item save(Item item) {
        return repository.save(item);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}