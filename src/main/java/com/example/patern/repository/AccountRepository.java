package com.example.patern.repository;

import com.example.patern.model.Account;

public interface AccountRepository {
    Account findByAccountId(Long accountId);
}
