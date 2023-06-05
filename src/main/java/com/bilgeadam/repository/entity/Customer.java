package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @OneToMany(mappedBy ="customer")
    private List<Account> accounts;
    @ManyToMany
    private List<Bank> banks;
}
