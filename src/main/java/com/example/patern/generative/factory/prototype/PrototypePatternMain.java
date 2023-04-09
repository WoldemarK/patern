package com.example.patern.generative.factory.prototype;

public class PrototypePatternMain {
    public static void main(String[] args) {
        Account currentAccount = (Account) AccountCache
                .accountCacheMap
                .get("CURRENT")
                .clone();
        currentAccount.accountType();
    }
}
