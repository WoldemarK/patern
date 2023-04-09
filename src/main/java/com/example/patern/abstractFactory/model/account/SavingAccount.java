package com.example.patern.abstractFactory.model.account;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
