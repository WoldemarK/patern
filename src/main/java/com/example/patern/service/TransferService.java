package com.example.patern.service;

import com.example.patern.model.Amount;

public interface TransferService {
    void transferAmmount(Long a, Long b, Amount amount);
}
