package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.service.BankService;
import com.bilgeadam.service.CustomerService;
import com.bilgeadam.utility.BankAppUtility;

import java.util.List;

public class CustomerController {
    private CustomerService customerService;
    public CustomerController() {
        this.customerService = new CustomerService();
    }


    public Customer createCustomer(Bank bank, Account account){
        Customer customer= Customer.builder()
                .name(BankAppUtility.stringVeriAlma("Lütfen bir isim giriniz"))
                .username(BankAppUtility.stringVeriAlma("lütfen kullanıcı ismi giriniz"))
                .password(BankAppUtility.stringVeriAlma("lütfen şifre giriniz"))
                .banks(List.of(bank))
                .accounts(List.of(account))
                .build();
        account.setCustomer(customer);
     return   customerService.save(customer);

    }

}
