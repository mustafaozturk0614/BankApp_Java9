package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.service.BankService;

public class BankController {
    private BankService bankService;
    public BankController() {
        this.bankService = new BankService();
    }
}
