package com.example.patern.generative.factory.abstractFactory.model.account;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
