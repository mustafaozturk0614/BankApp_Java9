package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.utility.MyFactoryRepository;

public class BankRepository extends MyFactoryRepository<Bank,Long> {

    public BankRepository() {
        super(new Bank());
    }
}
