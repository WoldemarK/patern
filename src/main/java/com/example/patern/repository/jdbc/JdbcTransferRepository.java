package com.example.patern.repository.jdbc;

import com.example.patern.model.Account;
import com.example.patern.model.Amount;
import com.example.patern.repository.TransferRepository;

public class JdbcTransferRepository implements TransferRepository {
    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        System.out.println("Transfering amount from account A to B via JDBC implementation");
    }

}
