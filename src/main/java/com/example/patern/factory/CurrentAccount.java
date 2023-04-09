package com.example.patern.factory;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
