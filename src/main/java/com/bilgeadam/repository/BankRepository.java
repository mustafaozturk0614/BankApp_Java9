package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Bank;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryRepository;

import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;

public class BankRepository extends MyFactoryRepository<Bank,Long> {

    public BankRepository() {
        super(new Bank());
    }


    public void  deneme(){
        String hql="select b.customers from Bank as b where b.id=2";
        TypedQuery<Collection> typedQuery=getEntityManager().createQuery(hql,Collection.class);

        System.out.println(typedQuery.getResultList());
    }
}
