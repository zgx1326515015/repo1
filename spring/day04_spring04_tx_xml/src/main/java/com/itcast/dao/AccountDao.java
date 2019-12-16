package com.itcast.dao;

import com.itcast.domain.Account;

/**
 * @Auther:bn
 * @Date:2019/11/3018:46
 */
public interface AccountDao {
    public Account findById(int id);
    public void update(Account account);
}
