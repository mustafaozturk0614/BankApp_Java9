package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Account;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.MyFactoryRepository;

import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.List;

public class AccountRepository extends MyFactoryRepository<Account,Long> {
    public AccountRepository() {
        super(new Account());
    }



    public List<Account> findByBalanceWithNamedQuery(){
        TypedQuery<Account> typedQuery=getEntityManager().createNamedQuery("findByBalance", Account.class);
        typedQuery.setParameter("my_balance",5000D);
        return  typedQuery.getResultList();
    }

    public  List<Account> findByCreatedDateWithNamedQuery(){
        TypedQuery<Account> typedQuery=getEntityManager().createNamedQuery("findByCreatedDate", Account.class);
        typedQuery.setParameter("date", LocalDate.parse("2023-05-05"));
        return  typedQuery.getResultList();
    }

    public double  sumAccountOneBank(Long bankId){
        CriteriaQuery<Double> criteriaQuery=getCriteriaBuilder().createQuery(Double.class);
        Root<Account> root=criteriaQuery.from(Account.class);
        criteriaQuery.select(getCriteriaBuilder().sum(root.get("balance")))
                .where(getCriteriaBuilder().equal(root.get("bank").get("id"),bankId));
        return getEntityManager().createQuery(criteriaQuery).getSingleResult();
    }

    public void  joinOrnek(){
        TypedQuery<Tuple> typedQuery=getEntityManager().createNamedQuery("joinornek",Tuple.class);
        typedQuery.getResultList().forEach(x-> System.out.println(x.get(0)+"-"+x.get(1)));
    }

}
