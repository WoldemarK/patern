package com.example.patern.generative.factory.abstractFactory;

import com.example.patern.generative.factory.abstractFactory.model.account.Account;
import com.example.patern.generative.factory.abstractFactory.model.bank.Bank;

public abstract class AbstractFactory {
   protected abstract Bank getBank(String bankName);
   protected abstract Account getAccount(String accountType);
}
