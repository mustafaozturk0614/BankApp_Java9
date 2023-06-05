package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.service.AccountService;

import java.util.List;

public class AccountController {

    private AccountService accountService;

    public AccountController(){
        this.accountService = new AccountService();
    }

    public List<Account> findByBalanceWithNamedQuery(){
        return  accountService.findByBalanceWithNamedQuery();
    }

    public  List<Account> findByCreatedDateWithNamedQuery(){
        return accountService.findByCreatedDateWithNamedQuery();
    }

    public double  sumAccountOneBank(Long bankId){
        return accountService.sumAccountOneBank(bankId);
    }
}
