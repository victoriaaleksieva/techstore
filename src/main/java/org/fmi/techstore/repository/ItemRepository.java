package org.fmi.techstore.repository;

import org.fmi.techstore.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository
        extends JpaRepository<Item, Integer> {
}