package com.service1.Accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{

    private long customerId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accountNumber;

    private String accountType;
    private String branchAddress;

}
