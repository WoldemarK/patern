package com.example.patern.generative.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        Account savingAccount = accountFactory.getAccount("saving");
        savingAccount.accountType();

        Account currentAccount = accountFactory.getAccount("current");
        currentAccount.accountType();
    }
}
