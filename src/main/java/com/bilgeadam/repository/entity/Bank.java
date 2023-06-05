package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    @OneToMany(mappedBy = "bank")
    @ToString.Exclude
    private List<Account> accounts;
    @ManyToMany(mappedBy = "banks")
    @ToString.Exclude
    private List<Customer> customers;

}
