package com.example.patern.model;

import lombok.Data;

@Data
public class Account {
    private Long accountId;
    private String name;
    private Amount amount;

    public Account(Long accountId, String name, Amount amount) {
        this.accountId = accountId;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", name=" + name + ", amount=" + amount + "]";
    }
}
