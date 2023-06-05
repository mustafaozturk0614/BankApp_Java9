package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.service.BankService;

import java.util.List;

public class BankController {
    private BankService bankService;
    public BankController() {
        this.bankService = new BankService();
    }

    public Bank createBank(Bank bank) {
        return  bankService.save(bank);
    }

    public List<Bank> findAll(){
        return  bankService.findAll();
    }
}
