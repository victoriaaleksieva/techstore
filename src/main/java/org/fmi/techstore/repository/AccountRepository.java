package org.fmi.techstore.repository;

import org.fmi.techstore.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository
        extends JpaRepository<Account, String> {
}