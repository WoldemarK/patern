package com.example.patern.structural.bridge;

public class IciciBank extends Bank {
    public IciciBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.print("Open your account with ICICI Bank");
        return account;
    }
}
