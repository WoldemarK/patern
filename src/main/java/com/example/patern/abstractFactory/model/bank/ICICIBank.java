package com.example.patern.abstractFactory.model.bank;

public class ICICIBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("ICICI Bank Ltd.");
    }
}
