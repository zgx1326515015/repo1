package com.itcast.dao;

import com.itcast.domain.Account;

/**
 * @Auther:bn
 * @Date:2019/11/3011:28
 */
public interface AccountDao {
    Account findById(int id);
    void update(Account account);
}
