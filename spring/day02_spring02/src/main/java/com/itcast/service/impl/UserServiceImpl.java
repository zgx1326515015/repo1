package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import com.itcast.service.UserService;

import java.util.*;

/**
 * @Auther:bn
 * @Date:2019/11/2619:20
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;




    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {

        userDao.say();
    }
}
