package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String username;
    private String password;
    private String name;
    private String surName;
    private String address;
    @OneToMany(mappedBy ="customer",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Account> accounts;
    @ManyToMany
    @ToString.Exclude
    private List<Bank> banks;
}
