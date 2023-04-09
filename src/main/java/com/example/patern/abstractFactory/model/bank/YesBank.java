package com.example.patern.abstractFactory.model.bank;

public class YesBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("Yes Bank Pvt. Ltd.");
    }
}
