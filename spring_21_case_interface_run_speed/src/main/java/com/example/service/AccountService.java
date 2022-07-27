package com.example.service;

import com.example.domain.Account;

import java.util.List;

// @DATE 2022/7/27
// @TIME 10:19
// @AUTHOR zhangzhi
// @DESCRIPTION
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
