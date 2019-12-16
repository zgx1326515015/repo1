package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:bn
 * @Date:2019/11/3018:48
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao ad;
    @Override
    public void transfer(int sourceId, int targetId, float money) {
        Account sourceAccount = ad.findById(sourceId);
        Account targetAccount = ad.findById(targetId);
        sourceAccount.setMoney(sourceAccount.getMoney()-money);
        targetAccount.setMoney(targetAccount.getMoney()+money);
        ad.update(sourceAccount);
//        int i=1/0;
        ad.update(targetAccount);
    }
}
