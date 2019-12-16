package com.itcast.dao.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Auther:bn
 * @Date:2019/11/3011:28
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public Account findById(int id) {
        Account account=null;
        try {
            account=  template.queryForObject("select * from account where id = ? ",
                    new BeanPropertyRowMapper<Account>(Account.class),id);
        } catch (DataAccessException e) {

        }

        return account;
    }

    @Override
    public void update(Account account) {
        template.update("update account set money = ? where id = ?",account.getMoney(),account.getId());

    }
}
