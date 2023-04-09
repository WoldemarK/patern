package com.example.patern.generative.factory.abstractFactory.model.account;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
