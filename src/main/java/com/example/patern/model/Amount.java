package com.example.patern.model;

import lombok.Data;

@Data
public class Amount {
  private Double balance;
    public Amount(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Amount [balance=" + balance + "]";
    }
}
