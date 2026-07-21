package org.fmi.techstore.service;

import org.fmi.techstore.entity.Account;
import org.fmi.techstore.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public List<Account> findAll() {
        return repository.findAll();
    }

    public Account findById(String username) {
        return repository.findById(username)
                .orElseThrow();
    }

    public Account save(Account account) {
        return repository.save(account);
    }

    public void delete(String username) {
        repository.deleteById(username);
    }
}