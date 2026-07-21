package org.fmi.techstore.repository;

import org.fmi.techstore.entity.Contains;
import org.fmi.techstore.entity.ContainsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainsRepository
        extends JpaRepository<Contains, ContainsId> {
}