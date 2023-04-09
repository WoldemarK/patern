package com.example.patern.builder;

public class AccountBuilder {
    final String accountName;
    final Long accountNumber;
    final String accountHolder;
    double balance;
    String type;
    double interest;

    public AccountBuilder(String accountName, String accountHolder, Long accountNumber) {
        this.accountName = accountName;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public AccountBuilder balance(double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder type(String type) {
        this.type = type;
        return this;
    }
    public AccountBuilder interest(double interest) {
        this.interest = interest;
        return this;
    }
    public Account build() {
        return new Account(this);
    }
    public String toString() {
        return "Account [accountName="
                + accountName + ", accountNumber="
                + accountNumber + ", accountHolder="
                + accountHolder + ", balance="
                + balance + ", type="
                + type + ", interest="
                + interest + "]";
    }
}
