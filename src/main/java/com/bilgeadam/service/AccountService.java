package com.bilgeadam.service;

import com.bilgeadam.repository.AccountRepository;
import com.bilgeadam.repository.CustomerRepository;
import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryService;

import javax.persistence.TypedQuery;
import java.util.List;

public class AccountService extends MyFactoryService<AccountRepository, Account,Long> {

    public AccountService() {
        super(new AccountRepository());
    }


    public List<Account> findByBalanceWithNamedQuery(){
        return  getRepository().findByBalanceWithNamedQuery();
    }
    public  List<Account> findByCreatedDateWithNamedQuery(){
        return getRepository().findByCreatedDateWithNamedQuery();
    }

    public double  sumAccountOneBank(Long bankId){
        return getRepository().sumAccountOneBank(bankId);
    }

}
