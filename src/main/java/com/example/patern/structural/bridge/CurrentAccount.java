package com.example.patern.structural.bridge;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("##It is a CURRENT Account##");
    }

    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT ");
        //return new CurrentAccount();
        return null;
    }
}
