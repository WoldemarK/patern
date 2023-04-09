package com.example.patern.generative.factory.abstractFactory;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;
import com.example.patern.generative.factory.abstractFactory.model.bank.Bank;
import com.example.patern.generative.factory.abstractFactory.model.bank.ICICIBank;
import com.example.patern.generative.factory.abstractFactory.model.bank.YesBank;

public class BankFactory extends AbstractFactory {

    private static final String ICICI_BANK = "ICICI";
    private static final String YES_BANK = "YES";

    @Override
    public Bank getBank(String bankName) {
        if (ICICI_BANK.equalsIgnoreCase(bankName)){
            return new ICICIBank();
        }
        if (YES_BANK.equalsIgnoreCase(bankName)){
            return new YesBank();
        }
            return null;
    }

    @Override
    public Account getAccount(String accountType) {
        return null;
    }
}
