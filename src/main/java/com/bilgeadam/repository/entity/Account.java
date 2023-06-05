package com.bilgeadam.repository.entity;

import com.bilgeadam.repository.enums.EAccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@NamedQueries({
      @NamedQuery(name = "findByBalance", query = "select a from Account as a  where  a.balance>:my_balance"),
       @NamedQuery(name = "findByCreatedDate" ,query="select  a from Account  as a where a.createdDate<:date"),
       @NamedQuery(name = "sumAccount" ,query="select  a from Account  as a where a.bank.id=:bankId"),
        @NamedQuery(name="joinornek" ,query="select a.accountNumber,b.name from Account  as a  join Bank as b on a.bank.id=b.id")
}
)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Enumerated(EnumType.STRING)
    private EAccountType accountType;
    @Builder.Default
    private String accountNumber= UUID.randomUUID().toString();
    @Builder.Default
    private LocalDate createdDate=LocalDate.now();
    private double balance;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Bank bank;

}
