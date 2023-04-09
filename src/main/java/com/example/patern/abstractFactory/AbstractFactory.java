package com.example.patern.abstractFactory;

import com.example.patern.abstractFactory.model.account.Account;
import com.example.patern.abstractFactory.model.bank.Bank;

public abstract class AbstractFactory {
   protected abstract Bank getBank(String bankName);
   protected abstract Account getAccount(String accountType);
}
