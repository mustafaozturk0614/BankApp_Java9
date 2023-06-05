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
