package com.bilgeadam.service;

import com.bilgeadam.repository.BankRepository;
import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.utility.MyFactoryService;

public class BankService  extends MyFactoryService<BankRepository, Bank,Long> {

    public BankService() {
        super(new BankRepository());
    }
}
