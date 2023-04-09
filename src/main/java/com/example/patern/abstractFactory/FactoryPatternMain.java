package com.example.patern.abstractFactory;

import com.example.patern.abstractFactory.model.account.Account;
import com.example.patern.abstractFactory.model.bank.Bank;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        Account savingAccount = accountFactory.getAccount("saving");
        savingAccount.accountType();

        Account currentAccount = accountFactory.getAccount("current");
        currentAccount.accountType();

        System.out.println("+___(*)^(*)____+");

        BankFactory bankFactory = new BankFactory();

        Bank icici = bankFactory.getBank("icici");
        icici.bankName();

        Bank yes = bankFactory.getBank("yes");
        yes.bankName();
    }
}
