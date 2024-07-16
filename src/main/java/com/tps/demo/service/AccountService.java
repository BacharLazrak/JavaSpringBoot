package com.tps.demo.service;

import com.tps.demo.dto.AccountDto;
import com.tps.demo.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccout(Long id);
}
