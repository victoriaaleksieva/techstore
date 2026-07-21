package org.fmi.techstore.service;

import org.fmi.techstore.entity.Contains;
import org.fmi.techstore.entity.ContainsId;
import org.fmi.techstore.repository.ContainsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainsService {

    private final ContainsRepository repository;

    public ContainsService(ContainsRepository repository) {
        this.repository = repository;
    }

    public List<Contains> findAll() {
        return repository.findAll();
    }

    public Contains findById(ContainsId id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Contains entry not found"));
    }

    public Contains save(Contains contains) {
        return repository.save(contains);
    }

    public void delete(ContainsId id) {
        repository.deleteById(id);
    }
}