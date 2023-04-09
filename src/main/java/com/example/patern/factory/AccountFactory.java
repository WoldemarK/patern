package com.example.patern.factory;

public class AccountFactory {
    private static final String CURRENT_ACCOUNT = "CURRENT";
    private static final String SAVING_ACCOUNT = "SAVING";

    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new CurrentAccount();
        }
        if (SAVING_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
