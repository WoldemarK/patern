package com.example.patern.structural.bridge;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("##It is a SAVING Account##");
    }

    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT ");
        return new SavingAccount();
    }
}
