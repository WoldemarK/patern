package com.example.patern.repository.jdbc;

import com.example.patern.model.Account;
import com.example.patern.model.Amount;
import com.example.patern.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {
    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
    }
}
