package com.example.patern.generative.factory;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
