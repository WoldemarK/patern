package com.example.patern.structural.adapter;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway{
    private final PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}
