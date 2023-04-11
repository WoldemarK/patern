package com.example.patern.structural.compositeObject;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
