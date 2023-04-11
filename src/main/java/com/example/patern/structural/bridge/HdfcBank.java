package com.example.patern.structural.bridge;

public class HdfcBank extends Bank {
    public HdfcBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.print("Open your account with HDFC Bank");
        return account;
    }
}
