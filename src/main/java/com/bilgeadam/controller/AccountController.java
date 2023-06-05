package com.bilgeadam.controller;

import com.bilgeadam.service.AccountService;

public class AccountController {

    private AccountService accountService;

    public AccountController(){
        this.accountService = new AccountService();
    }
}
