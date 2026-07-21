package org.fmi.techstore.controller;

import org.fmi.techstore.entity.Account;
import org.fmi.techstore.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<Account> getAll() {
        return service.findAll();
    }

    @GetMapping("/{username}")
    public Account getOne(@PathVariable String username) {
        return service.findById(username);
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.save(account);
    }

    @PutMapping("/{username}")
    public Account update(
            @PathVariable String username,
            @RequestBody Account account) {

        account.setUsername(username);
        return service.save(account);
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable String username) {
        service.delete(username);
    }
}