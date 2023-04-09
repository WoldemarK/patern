package com.example.patern.structural.adapter;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;

public class PaymentGatewayImpl implements PaymentGateway{
    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
