package com.viking.vikingbudget.vikingbudgetservice.controller;

import com.viking.vikingbudget.vikingbudgetservice.model.Account;
import com.viking.vikingbudget.vikingbudgetservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("account")
    public void createAccount(@RequestBody Account account) throws ExecutionException, InterruptedException {
        accountService.insertAccount(account);
    }

    @GetMapping("account/{accountId}")
    public Account getAccount(@PathVariable String accountId) throws ExecutionException, InterruptedException {
        return accountService.retrieveAccount(accountId);
    }

    @PutMapping("account}")
    public void updateAccount(@RequestBody Account account) throws ExecutionException, InterruptedException {
        accountService.updateAccount(account);
    }

    @DeleteMapping("account/{accountId}")
    public void deleteAccount(@PathVariable String accountId) throws ExecutionException, InterruptedException {
        accountService.retrieveAccount(accountId);
    }


}
