package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryRepository;

public class AccountRepository extends MyFactoryRepository<Account,Long> {
    public AccountRepository() {
        super(new Account());
    }
}
