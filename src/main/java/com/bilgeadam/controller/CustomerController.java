package com.bilgeadam.controller;

import com.bilgeadam.service.BankService;
import com.bilgeadam.service.CustomerService;

public class CustomerController {
    private CustomerService customerService;
    public CustomerController() {
        this.customerService = new CustomerService();
    }
}
