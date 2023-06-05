package com.bilgeadam.service;

import com.bilgeadam.repository.AccountRepository;
import com.bilgeadam.repository.CustomerRepository;
import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryService;

public class AccountService extends MyFactoryService<AccountRepository, Account,Long> {

    public AccountService() {
        super(new AccountRepository());
    }
}
