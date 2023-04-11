package com.example.patern.structural.compositeObject;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account {
    private final List<Account> childAccounts = new ArrayList<>();

    @Override
    public void accountType() {
        for (Account account : childAccounts) {
            account.accountType();
        }
    }

    public void add(Account account) {
        childAccounts.add(account);
    }

    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
