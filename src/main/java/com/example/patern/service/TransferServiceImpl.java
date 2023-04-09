package com.example.patern.service;

import com.example.patern.model.Account;
import com.example.patern.model.Amount;
import com.example.patern.repository.AccountRepository;
import com.example.patern.repository.TransferRepository;
import org.springframework.stereotype.Component;

@Component
public class TransferServiceImpl implements TransferService{
    AccountRepository accountRepository;

    TransferRepository transferRepository;

    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        super();
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmmount(Long a, Long b, Amount amount) {
        Account accountA = accountRepository.findByAccountId(a);
        Account accountB = accountRepository.findByAccountId(b);
        transferRepository.transfer(accountA, accountB, amount);
    }
}
