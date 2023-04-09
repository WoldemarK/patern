package com.example.patern.repository;

import com.example.patern.model.Account;
import com.example.patern.model.Amount;

public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}
