package com.example.patern.structural.adapter;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;

public interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}
