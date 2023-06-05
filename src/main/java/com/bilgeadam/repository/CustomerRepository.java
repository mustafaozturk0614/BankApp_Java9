package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryRepository;

public class CustomerRepository extends MyFactoryRepository<Customer,Long> {

    public CustomerRepository() {
        super(new Customer());
    }
}
