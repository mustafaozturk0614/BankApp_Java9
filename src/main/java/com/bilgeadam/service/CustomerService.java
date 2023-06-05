package com.bilgeadam.service;

import com.bilgeadam.repository.BankRepository;
import com.bilgeadam.repository.CustomerRepository;
import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryService;

public class CustomerService extends MyFactoryService<CustomerRepository, Customer,Long> {

    public CustomerService() {
        super(new CustomerRepository());
    }
}
