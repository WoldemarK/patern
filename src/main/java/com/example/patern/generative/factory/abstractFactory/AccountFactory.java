package com.example.patern.generative.factory.abstractFactory;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;
import com.example.patern.generative.factory.abstractFactory.model.account.CurrentAccount;
import com.example.patern.generative.factory.abstractFactory.model.account.SavingAccount;
import com.example.patern.generative.factory.abstractFactory.model.bank.Bank;

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
