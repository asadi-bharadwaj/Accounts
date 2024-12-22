package com.service1.Accounts.service.impl;

import com.service1.Accounts.dto.CustomerDto;
import com.service1.Accounts.repository.AccountsRepository;
import com.service1.Accounts.repository.CustomerRepository;
import com.service1.Accounts.service.IAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements IAccountsService {
    @Autowired
    private AccountsRepository accountsRepository;
    @Autowired
    private CustomerRepository customerRepository;
    /**
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
