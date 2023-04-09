package com.example.patern.abstractFactory;

import com.example.patern.abstractFactory.model.account.Account;
import com.example.patern.abstractFactory.model.account.CurrentAccount;
import com.example.patern.abstractFactory.model.account.SavingAccount;
import com.example.patern.abstractFactory.model.bank.Bank;

public class AccountFactory extends AbstractFactory{
    private static final String CURRENT_ACCOUNT = "CURRENT";
    private static final String SAVING_ACCOUNT = "SAVING";

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

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
