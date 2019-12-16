package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2718:51
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;



    @Override
    public List<User> finAll() {
        return userDao.finAll();
    }
}
